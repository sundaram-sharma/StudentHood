package com.example.studenthood.presentation.main.navigationDrawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.catalin.profilepage.ProfileScreen
import com.example.studenthood.presentation.main.navigationDrawer.setting.*
import com.example.studenthood.util.NavDrawerRoutes

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavDrawerRoutes.Home.route) {
        composable(NavDrawerRoutes.Home.route) {
            HomeScreen(navController)
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

    }
}
@Composable
@Preview
fun NavigationPreview(){
    Navigation(rememberNavController())
}