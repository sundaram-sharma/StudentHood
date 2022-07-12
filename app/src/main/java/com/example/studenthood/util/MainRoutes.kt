package com.example.studenthood.util

sealed class MainRoutes(val route: String) {
    object SplashScreen : MainRoutes("SplashScreen") //Not used
    object LoginScreen : MainRoutes("LoginScreen")
    object SignUpScreen : MainRoutes("SignUpScreen")
    object MainScreen : MainRoutes("MainScreen")
    object ForgotPasswordScreen : MainRoutes("ForgotPasswordScreen")

    object Article : MainRoutes("Article")
    object Budget : MainRoutes("Budget")
    object HomeSearch : MainRoutes("HomeSearch")
    object JobSearch : MainRoutes("JobSearch")
    object Tiffin : MainRoutes("Tiffin")
    object ToDo : MainRoutes("ToDo")
    //object BackToHome : MainRoutes("ForgotPasswordScreen")

}