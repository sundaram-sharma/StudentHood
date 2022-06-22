package com.example.studenthood.util

sealed class Routes(val route: String) {
    object SplashScreen : Routes("SplashScreen")
    object LoginScreen : Routes("LoginScreen")
    object SignUpScreen : Routes("SignUpScreen")
    object ForgotPasswordScreen : Routes("ForgotPasswordScreen")
}