package com.sample.navigation

sealed class AppNavGraph {
    data object Drawer : AppNavGraph()
    data object Home : AppNavGraph()
    data object Settings : AppNavGraph()
}