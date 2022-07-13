package com.example.studenthood.viewModel

import android.provider.ContactsContract
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.instagramclone.domain.use_cases.AuthenticationUseCase
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.example.studenthood.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AuthenticationViewModel @Inject constructor(
    private val authUseCases: AuthenticationUseCase
):ViewModel(){

    val isUserAuthenticated get() = authUseCases.isUserAuthenticated() //return the boolean value through get() (getter setter)

    private val _signInState = mutableStateOf<Response<Boolean>>(Response.Success(false)) //typr of response boolean
    val signInState : State<Response<Boolean>> = _signInState  // we will access this variable

    private val _signUpState = mutableStateOf<Response<Boolean>>(Response.Success(false))
    val signUpState : State<Response<Boolean>> = _signUpState

    private val _signOutState = mutableStateOf<Response<Boolean>>(Response.Success(false)) //typr of response boolean
    val signOutState : State<Response<Boolean>> = _signOutState  // we will access this variable

    private val _firebaseAuthState = mutableStateOf<Boolean>(false)
    val firebaseAuthState : State<Boolean> = _firebaseAuthState

    //Making Sign In function
    fun signIn(email:String, password:String){
        viewModelScope.launch {
            authUseCases.firebaseSignIn(email=email, password=password).collect{
                _signInState.value = it
            }

        }
    }

    fun signUp(email: String, password: String, userName: String){
        viewModelScope.launch {
            authUseCases.firebaseSignUp(email = email, password = password, userName = userName).collect{
                _signUpState.value = it
            }
        }
    }

    fun signOut(){
        viewModelScope.launch {
            authUseCases.firebaseSignOut().collect{
                _signOutState.value = it
                if(it==Response.Success(true)){ //if sign out is successful
                    _signInState.value = Response.Success(false) //turn the success value to false
                }
            }
        }
    }
    fun getFirebaseAuthState(){
        viewModelScope.launch {
            authUseCases.firebaseAuthState().collect {
                _firebaseAuthState.value = it
            }
        }
    }
}