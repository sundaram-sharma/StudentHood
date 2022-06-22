package com.example.studenthood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.authentication.ForgotPasswordPage
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.ui.theme.StudentHoodTheme
import com.example.studenthood.util.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudentHoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StudentHoodTheme {
        MainScreen()
    }
}

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