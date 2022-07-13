package com.example.instagramclone.domain.use_cases


import com.example.studenthood.domain.repository.AuthenticationRepository
import javax.inject.Inject

class FirebaseSignOut @Inject constructor(
    private val repository: AuthenticationRepository //injecting AuthenticationRepository interface, dependency injection in constructor
) {
    // Operator Function invoke() Kotlin provides an interesting function called invoke, which is an operator function.
    // Specifying an invoke operator on a class allows it to be called on any instances of the class without a method name
    operator fun invoke()= repository.firebaseSignOut()  //calling interface function

}