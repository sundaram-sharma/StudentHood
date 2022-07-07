package com.example.studenthood.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.studenthood.R
import com.example.studenthood.ui.theme.Custom_blue
import com.example.studenthood.util.Routes
import kotlinx.coroutines.delay


@Composable
fun SplashScreenPage(navController: NavHostController){
    //Adding Animation to splash screen
    var startAnimation by remember { mutableStateOf(false) }

    val alphaAnim = animateFloatAsState(targetValue = if (startAnimation) 1f else 0f,
    animationSpec = tween(durationMillis = 3000))

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(4000)
        navController.popBackStack() //to remove splash from backstack
        navController.navigate(Routes.LoginScreen.route)
    }


    SplashScreen(alpha = alphaAnim.value)
}

@Composable
fun SplashScreen(alpha: Float) {

   // val scale = remember{ Animatable(0f) }
    //LaunchedEffect: run suspend functions in the scope of a composable
    //LaunchedEffect(key1 = true){}


    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(if (isSystemInDarkTheme()) Custom_blue else Color.White))

    { //this will occupy the full screen

        Image(modifier = Modifier.alpha(alpha = alpha), painter = painterResource(id = R.drawable.app_logo), //takes the image from drawable
            contentDescription = "Splash Screen Logo")
        Text(text = "StudentHood", fontSize = 30.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier
            .alpha(alpha = alpha)
            .padding(top = 160.dp)
            )
    }
}

@Composable
@Preview
fun SplashScreenPreview(){
    SplashScreen(alpha = 1f)
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES) // for the night node
fun SplashScreenDarkPreview(){
    SplashScreen(alpha = 1f)
}