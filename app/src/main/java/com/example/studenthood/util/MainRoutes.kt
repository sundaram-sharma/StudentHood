package com.example.studenthood.util

sealed class MainRoutes(val route: String) {
    object SplashScreen : MainRoutes("SplashScreen") //Not used
    object LoginScreen : MainRoutes("LoginScreen")
    object SignUpScreen : MainRoutes("SignUpScreen")
    object MainScreen : MainRoutes("MainScreen")
    object ForgotPasswordScreen : MainRoutes("ForgotPasswordScreen")


}