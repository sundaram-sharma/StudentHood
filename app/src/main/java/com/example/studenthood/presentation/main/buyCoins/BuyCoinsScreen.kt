package com.example.studenthood.presentation.main.buyCoins


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R


@Composable
fun BuyCoinsPage(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Buy Coins",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )

        Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Click",
                Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically))
        }
    }
}
@Composable
@Preview
fun BuyCoinsPagePreview(){
    BuyCoinsPage(rememberNavController())
}