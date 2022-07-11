package com.example.studenthood.presentation.main.tiffin

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.presentation.CustomTopAppBar

@Composable
fun TiffinListingPage(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        ScaffoldWithTopBarForgotPass(navController)
    }
}

@Composable
fun ScaffoldWithTopBarForgotPass(navController: NavHostController) {
    Scaffold(
        topBar = {
            CustomTopAppBar(navController, "Tiffin Listing", true)
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Tiffin Listing",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
        })
}

@Composable
@Preview(name = "Light Mode", showBackground = true)
fun TiffinListingPagePreview(){
    TiffinListingPage(rememberNavController())

}

@Composable
@Preview(uiMode= Configuration.UI_MODE_NIGHT_YES, showBackground = true, name="Dark Mode")
fun TiffinListingPageDarkPreview(){
    TiffinListingPage(rememberNavController())

}