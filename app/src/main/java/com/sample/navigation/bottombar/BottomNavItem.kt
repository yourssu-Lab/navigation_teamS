package com.sample.navigation.bottombar

import com.sample.navigation.R

sealed class BottomNavItem(
    val title: String, val icon: Int, val route: String
) {
    data object Auth : BottomNavItem(
        title = "Auth", icon = R.drawable.ic_auth, route = "Auth"
    )

    data object Home : BottomNavItem(
        title = "Home", icon = R.drawable.ic_home, route = "Home"
    )

    data object Drawer : BottomNavItem(
        title = "Drawer", icon = R.drawable.ic_drawer, route = "Drawer"
    )
}
