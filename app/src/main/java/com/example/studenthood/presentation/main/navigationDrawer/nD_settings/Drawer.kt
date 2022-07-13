package com.example.studenthood.presentation.main.navigationDrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R
import com.example.studenthood.util.MainRoutes
import com.example.studenthood.util.NavDrawerRoutes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun Drawer(scope: CoroutineScope, scaffoldState: ScaffoldState, navController: NavController) {
    val items = listOf(
        NavDrawerRoutes.Profile,
        NavDrawerRoutes.Home,

        NavDrawerRoutes.MainSettings,
        NavDrawerRoutes.LogOut
    )

    val itemsMain = listOf(
        MainRoutes.Budget,
        MainRoutes.BuyCoins,
        MainRoutes.Discussion,
        MainRoutes.HomeSearch,
        MainRoutes.JobSearch,
        MainRoutes.Tiffin,
        MainRoutes.ToDo
    )
    Column(
        modifier = Modifier
            .background(colorResource(id = R.color.purple_500))
    ) {
        // Header
        Column(modifier = Modifier.height(200.dp).fillMaxWidth()) {

            Image(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = R.drawable.app_logo.toString(),
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(10.dp)
                )

        }
        // Space between
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
        )
        // List of navigation items
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            com.example.studenthood.presentation.main.navigationDrawer.DrawerItem(item = item, selected = currentRoute == item.route, onItemClick = {

                /* Add code later */
                navController.navigate(item.route) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            saveState = true
                        }
                    }
                    // Avoid multiple copies of the same destination when
                    // reselecting the same item
                    launchSingleTop = true
                    // Restore state when reselecting a previously selected item
                    restoreState = true
                }
                // Close drawer
                scope.launch {
                    scaffoldState.drawerState.close()
                }

            })

        }

        //trial code
        /*
        itemsMain.forEach { item ->
            com.example.studenthood.presentation.main.navigationDrawer.DrawerItem(item = itemMain, selected = currentRoute == item.route, onItemClick = {

                /* Add code later */
                navController.navigate(item.route) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            saveState = true
                        }
                    }
                    // Avoid multiple copies of the same destination when
                    // reselecting the same item
                    launchSingleTop = true
                    // Restore state when reselecting a previously selected item
                    restoreState = true
                }
                // Close drawer
                scope.launch {
                    scaffoldState.drawerState.close()
                }

            })

        }

         */
        //trial code stop


        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Team StudentHood",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerPreview() {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val navController = rememberNavController()
    Drawer(scope = scope, scaffoldState = scaffoldState, navController = navController)
}