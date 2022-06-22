package com.example.studenthood.presentation.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.authentication.ForgotPasswordPage
import com.example.studenthood.presentation.authentication.LoginPage
import com.example.studenthood.presentation.authentication.SignUpPage
import com.example.studenthood.util.Routes

@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text="Profile Screen")
        }
        //BottomNavigationMenu(selectedItem = BottomNavigationItem.PROFILE, navController = navController)
    }
}