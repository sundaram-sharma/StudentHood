package com.example.studenthood.presentation.authentication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R
import com.example.studenthood.util.MainRoutes


@Composable
fun WelcomePage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200))
    ) { Box(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .weight(1f)){
        Text(text = "Welcome to StudentHood", modifier = Modifier.align(Alignment.Center))

    }

        Box(modifier = Modifier //middle level box
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f))
        {
            Button(onClick = {navController.navigate(MainRoutes.Main.route)}, modifier = Modifier
                .align(Alignment.Center)) {//change to main screen
                Text(text = "Guest")
            }
        }

        Box(modifier = Modifier //middle level box
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f))
        {
            Button(onClick = {navController.navigate(MainRoutes.LoginScreen.route)}, modifier = Modifier
                .align(Alignment.Center)) {//change to main screen
                Text(text = "Log In")
            }
        }


        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f)
        )
        {
            Button(onClick = {navController.navigate(MainRoutes.SignUpScreen.route)}, modifier = Modifier
                .align(Alignment.Center)) {//change to main screen
                Text(text = "Sign Up")
            }
        }

    }
}

@Composable
@Preview
fun WelcomeScreenPreview(){
    WelcomePage(rememberNavController())
}

