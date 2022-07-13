package com.example.studenthood.viewModel

import com.example.studenthood.domain.model.User
import com.example.studenthood.domain.repository.AuthenticationRepository
import com.example.studenthood.util.Constants
import com.example.studenthood.util.Response
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import java.lang.Exception
import javax.inject.Inject


class AuthenticationRepositoryImpl @Inject constructor(
    //taking from di
    private val auth: FirebaseAuth,
    private val firestore: FirebaseFirestore
) : AuthenticationRepository { //implementing all member from repository

    var operationSuccessful : Boolean = false //to be used in firebasesignin

    override fun isUserAuthenticatedInFirebase(): Boolean {
        // returning the current user
        return auth.currentUser!=null
    }

    //@ExperimentalCoroutinesApi
    override fun getFirebaseAuthState(): Flow<Boolean> =
        //callbackFlow offers you a synchronized way to do emit() with the trySend() option
        callbackFlow{
            val authStateListener = FirebaseAuth.AuthStateListener {

                //We need to use callbackFlow to use trySend()
                //trySend() is a synchronized way (a non suspending way) for emit() or send()
                trySend(auth.currentUser == null)
            }
            auth.addAuthStateListener(authStateListener)// add the authStateListener

            //awaitClose ==>
            //Suspends the current coroutine until the channel is either
            // closed or cancelled and invokes the given block before resuming the coroutine
            awaitClose{
                auth.removeAuthStateListener(authStateListener)//remove the authStateListener
            }
        }

    override fun firebaseSignIn(email: String, password: String): Flow<Response<Boolean>> = flow {
        operationSuccessful = false //to reload the value to default before executing this function
        try {
            emit(Response.Loading)
            auth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
                operationSuccessful = true
            }.await()//you call await() , it will be a suspended call,
            // which will create a new continuation and execution flow,
            // waiting until the value is ready for use
            emit(Response.Success(operationSuccessful))

        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "An unexpected Error"))
        }
    }
    override fun firebaseSignOut(): Flow<Response<Boolean>> = flow {
        try {

            //Emit collects the value emitted by the upstream.
            // This method is not thread-safe and should not be invoked concurrently.
            emit(Response.Loading)
            auth.signOut()
            emit(Response.Success(true))
        }
        catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "An unexpected Error"))
        }
    }

    override fun firebaseSignUp(
        email: String,
        password: String,
        userName: String
    ): Flow<Response<Boolean>> = flow{
        operationSuccessful = false
        try {
            emit(Response.Loading)
            auth.createUserWithEmailAndPassword(email, password).addOnSuccessListener {
                operationSuccessful = true
            }
            if(operationSuccessful){
                val userid = auth.currentUser?.uid!! //Returns the currently signed-in FirebaseUser or null if there is none
                val obj = User(userName = userName, userid = userid, password = password, email = email)
                firestore.collection(Constants.COLLECTION_NAME_USERS).document(userid).set(obj).addOnSuccessListener {

                }.await()
                emit(Response.Success(operationSuccessful)) //user reponse class

            }

        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "An unexpected Error"))
        }
    }
}
