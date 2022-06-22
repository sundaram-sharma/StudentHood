package com.example.studenthood.presentation

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.studenthood.R

@Composable
fun SplashScreen(navController: NavController) {

    val scale = remember{
        Animatable(0f)
    }
    //LaunchedEffect: run suspend functions in the scope of a composable
    LaunchedEffect(key1 = true){

    }


    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()){ //this will occupy the full screen

        Image(painter = painterResource(id = R.drawable.splash_screen_logo), //takes the image from drawable
            contentDescription = "Splash Screen Logo",
            modifier = Modifier.scale(scale.value))
    }
}