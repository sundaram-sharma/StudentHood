package com.example.studenthood.presentation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.MainActivityPage
import com.example.studenthood.R
import com.example.studenthood.presentation.main.navigationDrawer.Drawer
import com.example.studenthood.presentation.main.navigationDrawer.Navigation
import com.example.studenthood.presentation.main.navigationDrawer.TopBar

@Composable
fun MainPage(navController: NavController){
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    // If you want the drawer from the right side, uncomment the following
    // CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scope = scope, scaffoldState = scaffoldState) },
        drawerBackgroundColor = colorResource(id = R.color.purple_700),
        drawerContent = {
            Drawer(scope = scope, scaffoldState = scaffoldState, navController = navController)
        },
    ) {
        Navigation(navController = navController)
    }
}

@Composable
@Preview
fun MainPagePreview() {
    MainPage(rememberNavController())
}

