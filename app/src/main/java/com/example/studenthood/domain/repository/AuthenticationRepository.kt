package com.example.studenthood.domain.repository

import com.example.studenthood.util.Response
import kotlinx.coroutines.flow.Flow

//a flow is a type that can emit multiple values sequentially,
// as opposed to suspend functions that return only a single value.
// For example, you can use a flow to receive live updates from a database.
interface AuthenticationRepository {

    fun isUserAuthenticatedInFirebase(): Boolean

    fun getFirebaseAuthState(): Flow<Boolean> //get the user current authentication state

    //import the Response from util
    fun firebaseSignIn(email:String,password:String): Flow<Response<Boolean>>

    fun firebaseSignOut() : Flow<Response<Boolean>>

    fun firebaseSignUp(email:String,password:String, userName:String) : Flow<Response<Boolean>>
}