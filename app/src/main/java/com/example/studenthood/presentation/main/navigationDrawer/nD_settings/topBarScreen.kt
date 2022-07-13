package com.example.studenthood.presentation.main.navigationDrawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studenthood.R
import com.example.studenthood.util.MainRoutes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(scope: CoroutineScope, scaffoldState: ScaffoldState, navController: NavHostController) {
    Row(modifier = Modifier.background(color = Color.LightGray)) {
        TopAppBar( modifier = Modifier.weight(4f),
            navigationIcon = {
                IconButton(
                    onClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }) {
                    Icon(Icons.Filled.Menu, "")
                }


            },
            title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp, modifier = Modifier.fillMaxWidth()) },


            //backgroundColor = colorResource(id = R.color.purple_200),
            contentColor = Color.White
        )
        Box(modifier = Modifier.weight(1f)){

            IconButton(modifier = Modifier.fillMaxWidth(), onClick = {
                navController.navigate(MainRoutes.Notifications.route)
                //TODO: Need function for notification icon

            }) {
                Icon(Icons.Filled.Notifications, "",Modifier)
            }
        }
    }


}

@Preview(showBackground = false)
@Composable
fun TopBarPreview() {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    TopBar(scope = scope, scaffoldState = scaffoldState, rememberNavController())
}