package com.example.studenthood.presentation.main.navigationDrawer.setting

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R
import com.example.studenthood.util.MainRoutes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*

@Composable
fun HomePage(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200))
    ) { Box(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .weight(1f)){
        Text(text = "User Info")
    }
        Row(modifier = Modifier //middle level box
            .fillMaxWidth()
            .weight(1f)){

            Button(onClick = {navController.navigate(MainRoutes.HomeSearch.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="House Search icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "House Search",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }


            Button(onClick = {navController.navigate(MainRoutes.JobSearch.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="Cart button icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "Job Search",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }

        }

        Row(modifier = Modifier //middle level box
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f)){

            Button(onClick = {navController.navigate(MainRoutes.Tiffin.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="Cart button icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "Tiffin Provider",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }


            Button(onClick = {navController.navigate(MainRoutes.Discussion.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="Discussion forum icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "Discussion forum",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }

        }

        Row(modifier = Modifier //middle level box
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f)){

            Button(onClick = {navController.navigate(MainRoutes.ToDo.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="ToDo icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "ToDo",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }


            Button(onClick = {navController.navigate(MainRoutes.Budget.route)}, modifier = Modifier
                .size(20.dp)
                .weight(1f)
                .aspectRatio(1f)
                .padding(10.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painterResource(id = R.drawable.app_logo),
                        contentDescription ="Cart button icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(20.dp)
                            .weight(1f))


                    Text(text = "Budget",color = Color.White, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f))

                }


            }

        }


        Box(modifier = Modifier
            .fillMaxWidth()
            )
            { Button(onClick = {
                navController.navigate(MainRoutes.BuyCoins.route)
                //your onclick code
            },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray), modifier = Modifier
                    .padding(10.dp)
                    .align(
                        Alignment.Center
                    )){
                Text(text = "Buy Coins",color = Color.White)


            }
        }

    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    HomePage(rememberNavController())
}

