package com.example.studenthood.presentation.main.budget

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R
import com.example.studenthood.presentation.main.navigationDrawer.Drawer
import com.example.studenthood.presentation.main.navigationDrawer.Navigation
import com.example.studenthood.presentation.main.navigationDrawer.TopBar
import androidx.compose.foundation.layout.padding


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BudgetPage(navController: NavHostController) {


}

@Composable
@Preview
fun BudgetPagePreview(){
    BudgetPage(rememberNavController())
}