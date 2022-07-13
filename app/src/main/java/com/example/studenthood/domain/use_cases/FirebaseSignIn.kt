package com.example.instagramclone.domain.use_cases


import com.example.studenthood.domain.repository.AuthenticationRepository
import javax.inject.Inject

class FirebaseSignIn @Inject constructor(
    private val repository: AuthenticationRepository //injecting authentication repository, dependency injection in constructor
) {
    operator fun invoke(email:String, password:String) = repository.firebaseSignIn(email, password)
}