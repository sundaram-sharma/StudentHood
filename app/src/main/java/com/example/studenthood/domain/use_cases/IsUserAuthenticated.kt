package com.example.instagramclone.domain.use_cases


import com.example.studenthood.domain.repository.AuthenticationRepository
import javax.inject.Inject

class IsUserAuthenticated @Inject constructor(
    private val repository: AuthenticationRepository //injecting authentication repository, dependency injection in constructor
) {
    operator fun invoke() = repository.isUserAuthenticatedInFirebase() //launch this function
}