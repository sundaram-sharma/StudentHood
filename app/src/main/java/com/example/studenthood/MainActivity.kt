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
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.presentation.MainPage
import com.example.studenthood.presentation.authentication.ForgotPasswordPage1
import com.example.studenthood.presentation.main.articles.ArticlesPage
import com.example.studenthood.presentation.main.budget.BudgetPage
import com.example.studenthood.presentation.main.homeSearch.HomeSearchPage
import com.example.studenthood.presentation.main.jobSearch.JobSearchPage
import com.example.studenthood.presentation.main.navigationDrawer.setting.HomeScreen
import com.example.studenthood.presentation.main.tiffin.TiffinListingPage
import com.example.studenthood.presentation.main.todo.ToDoPage
//import com.example.studenthood.presentation.main.navigationDrawer.setting.ProfileScreen
import com.example.studenthood.ui.theme.StudentHoodTheme
import com.example.studenthood.util.MainRoutes

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

    NavHost(navController = navController, startDestination = MainRoutes.SplashScreen.route) {

        composable(MainRoutes.SplashScreen.route) { navBackStack ->
            SplashScreenPage(navController)
        }

        composable(MainRoutes.MainScreen.route) {
            MainPage(navController)
        }

        composable(MainRoutes.LoginScreen.route) {
            LoginPage(navController)
        }

        composable(MainRoutes.SignUpScreen.route) {
            SignUpPage(navController)
        }

        composable(MainRoutes.ForgotPasswordScreen.route) { navBackStack ->
            ForgotPasswordPage1(navController)
        }

        composable(MainRoutes.ForgotPasswordScreen.route) { navBackStack ->
            HomeScreen(navController)
        }
        composable(MainRoutes.Article.route) { navBackStack ->
            ArticlesPage(navController = navController)
        }

        composable(MainRoutes.Budget.route) { navBackStack ->
            BudgetPage(navController = navController)
        }

        composable(MainRoutes.HomeSearch.route) { navBackStack ->
            HomeSearchPage(navController = navController)
        }

        composable(MainRoutes.JobSearch.route) { navBackStack ->
            JobSearchPage(navController = navController)
        }

        composable(MainRoutes.Tiffin.route) { navBackStack ->
            TiffinListingPage(navController = navController)
        }

        composable(MainRoutes.ToDo.route) { navBackStack ->
            ToDoPage(navController = navController)
        }




    }
}