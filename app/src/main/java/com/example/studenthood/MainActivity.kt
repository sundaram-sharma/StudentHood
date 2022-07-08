package com.example.studenthood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.SplashScreenPage
import com.example.studenthood.presentation.authentication.ForgotPasswordPage
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.presentation.main.MainPage
import com.example.studenthood.ui.theme.StudentHoodTheme
import com.example.studenthood.util.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudentHoodTheme {

                //val navController = rememberNavController()
                //SplashScreenPage(navController = navController)
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainActivityPage()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StudentHoodTheme {
        MainActivityPage()
    }
}

@Composable
fun MainActivityPage(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.MainScreen.route) {

        composable(Routes.SplashScreen.route) { navBackStack ->
            SplashScreenPage(navController = navController)
        }

        composable(Routes.SplashScreen.route) {
            MainPage(navController = navController)
        }

        composable(Routes.LoginScreen.route) {
            LoginPage(navController = navController)
        }

        composable(Routes.SignUpScreen.route) {
            SignUpPage(navController = navController)
        }

        composable(Routes.ForgotPasswordScreen.route) { navBackStack ->
            ForgotPasswordPage(navController = navController)
        }

        composable(Routes.ForgotPasswordScreen.route) { navBackStack ->
            ForgotPasswordPage(navController = navController)
        }

    }
}