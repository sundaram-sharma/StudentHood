package com.example.studenthood.presentation.main.navigationDrawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.catalin.profilepage.ProfileScreen
import com.example.studenthood.presentation.MainPage
import com.example.studenthood.presentation.SplashPage
import com.example.studenthood.presentation.authentication.ForgotPasswordPage1
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.presentation.authentication.WelcomePage
import com.example.studenthood.presentation.main.budget.BudgetPage
import com.example.studenthood.presentation.main.buyCoins.BuyCoinsPage
import com.example.studenthood.presentation.main.discussion.DiscussionPage
import com.example.studenthood.presentation.main.homeSearch.HomeSearchPage
import com.example.studenthood.presentation.main.jobSearch.JobSearchPage
import com.example.studenthood.presentation.main.navigationDrawer.setting.*
import com.example.studenthood.presentation.main.notifications.NotificationPage
import com.example.studenthood.presentation.main.tiffin.TiffinListingPage
import com.example.studenthood.presentation.main.todo.ToDoPage
import com.example.studenthood.util.MainRoutes
import com.example.studenthood.util.NavDrawerRoutes

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavDrawerRoutes.Home.route) {
        composable(NavDrawerRoutes.Home.route) {
            HomePage(navController)
        }

        composable(NavDrawerRoutes.Profile.route) {
            ProfileScreen()
        }

        composable(NavDrawerRoutes.MainSettings.route) {
            MainSettingsScreen()
        }

        composable(NavDrawerRoutes.LogOut.route) {
            LogOutScreen()
        }

        composable(MainRoutes.SplashScreen.route) { navBackStack ->
            SplashPage(navController)
        }

        composable(MainRoutes.Main.route) {
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

        composable(MainRoutes.HomeSearch.route) { navBackStack ->
            HomePage(navController)
        }
        composable(MainRoutes.Discussion.route) { navBackStack ->
            DiscussionPage(navController = navController)
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

        composable(MainRoutes.Welcome.route) { navBackStack ->
            WelcomePage(navController = navController)
        }

        composable(MainRoutes.BuyCoins.route) { navBackStack ->
            BuyCoinsPage(navController = navController)
        }

        composable(MainRoutes.Notifications.route) { navBackStack ->
            NotificationPage(navController = navController)
        }

    }
}
@Composable
@Preview
fun NavigationPreview(){
    Navigation(rememberNavController())
}