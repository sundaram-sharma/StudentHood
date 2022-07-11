package com.example.studenthood.presentation.main.navigationDrawer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.main.ProfileScreen
import com.example.studenthood.presentation.main.navigationDrawer.setting.*
import com.example.studenthood.util.NavDrawerRoutes

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavDrawerRoutes.Home.route) {
        composable(NavDrawerRoutes.Home.route) {
            HomeScreen()
        }

        composable(NavDrawerRoutes.Profile.route) {
            ProfileScreen(rememberNavController())
        }

        composable(NavDrawerRoutes.MainSettings.route) {
            MainSettingsScreen()
        }

        composable(NavDrawerRoutes.LogOut.route) {
            LogOutScreen()
        }

    }
}