package com.example.studenthood.util

sealed class MainRoutes(val route: String) {
    object SplashScreen : MainRoutes("SplashScreen") //Not used
    object LoginScreen : MainRoutes("LoginScreen")
    object SignUpScreen : MainRoutes("SignUpScreen")
    object Main : MainRoutes("MainScreen")
    object ForgotPasswordScreen : MainRoutes("ForgotPasswordScreen")

    object Discussion : MainRoutes("ArticleScreen")
    object Budget : MainRoutes("BudgetScreen")
    object HomeSearch : MainRoutes("HomeSearchScreen")
    object JobSearch : MainRoutes("JobSearchScreen")
    object Tiffin : MainRoutes("TiffinScreen")
    object ToDo : MainRoutes("ToDoScreen")
    object Welcome : MainRoutes("WelcomeScreen")

    object BuyCoins : MainRoutes("BuyCoinsScreen")

    object Notifications : MainRoutes("NotificationsScreen")

}