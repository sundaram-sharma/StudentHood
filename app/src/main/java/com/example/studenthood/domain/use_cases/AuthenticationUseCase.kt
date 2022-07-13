package com.example.instagramclone.domain.use_cases

//Data class is a simple class which is used to hold data/state and contains standard functionality
data class AuthenticationUseCase (
    val isUserAuthenticated: IsUserAuthenticated,
    val firebaseAuthState: FirebaseAuthState,
    val firebaseSignIn: FirebaseSignIn,
    val firebaseSignUp: FirebaseSignUp,
    val firebaseSignOut: FirebaseSignOut
    )
