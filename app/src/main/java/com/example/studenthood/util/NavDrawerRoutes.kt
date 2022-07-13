package com.example.studenthood.util

import com.example.studenthood.R

sealed class NavDrawerRoutes(var route: String, var icon: Int, var title: String) {
    object Home : NavDrawerRoutes("home", R.drawable.ic_home, "Home")
    object Profile : NavDrawerRoutes("profile", R.drawable.ic_home, "Profile")
    object MainSettings : NavDrawerRoutes("settings", R.drawable.ic_home, "Settings")
    object LogOut : NavDrawerRoutes("logOut", R.drawable.ic_home, "LogOut")
}
