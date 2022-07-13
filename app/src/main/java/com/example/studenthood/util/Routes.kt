package com.example.studenthood.util

sealed class Routes(val route: String) {
    object SplashScreen : Routes("SplashScreen") //Not used
    object LoginScreen : Routes("LoginScreen")
    object SignUpScreen : Routes("SignUpScreen")
    object HomeScreen : Routes("HomeScreen")
    object ForgotPasswordScreen : Routes("ForgotPasswordScreen")
}