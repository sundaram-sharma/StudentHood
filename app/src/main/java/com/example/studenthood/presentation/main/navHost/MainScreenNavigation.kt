package com.example.studenthood.presentation.main.navHost

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.catalin.profilepage.ProfileScreen
import com.example.studenthood.presentation.main.navigationDrawer.Navigation
import com.example.studenthood.presentation.main.navigationDrawer.setting.HomeScreen
import com.example.studenthood.presentation.main.navigationDrawer.setting.LogOutScreen
import com.example.studenthood.presentation.main.navigationDrawer.setting.MainSettingsScreen
import com.example.studenthood.util.NavDrawerRoutes


@Composable
fun MainScreenNavigation(navController: NavHostController) {

    val navController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = "home"){
            composable("home"){
                HomeScreen(navController)
            }
            composable("home"){
                HomeScreen(navController)
            }
            composable("home"){
                HomeScreen(navController)
            }
            composable("home"){
                HomeScreen(navController)
            }
        }
    }

}

@Composable
@Preview
fun MainScreenNavigationPreview(){
    MainScreenNavigation(rememberNavController())
}