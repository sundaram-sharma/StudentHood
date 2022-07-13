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
import com.example.studenthood.presentation.main.navigationDrawer.setting.HomePage


@Composable
fun MainScreenNavigation(navController: NavHostController) {

    val navController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = "home"){
            composable("home"){
                HomePage(navController)
            }
            composable("home"){
                HomePage(navController)
            }
            composable("home"){
                HomePage(navController)
            }
            composable("home"){
                HomePage(navController)
            }
        }
    }

}

@Composable
@Preview
fun MainScreenNavigationPreview(){
    MainScreenNavigation(rememberNavController())
}