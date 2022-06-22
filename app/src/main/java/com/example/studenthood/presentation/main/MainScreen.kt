package com.example.studenthood.presentation.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.authentication.ForgotPasswordPage
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.util.Routes

@Composable
fun MainScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LoginScreen.route) {

        composable(Routes.LoginScreen.route) {
            LoginPage(navController = navController)
        }

        composable(Routes.SignUpScreen.route) {
            SignUpPage(navController = navController)
        }

        composable(Routes.ForgotPasswordScreen.route) { navBackStack ->
            ForgotPasswordPage(navController = navController)
        }
    }
}