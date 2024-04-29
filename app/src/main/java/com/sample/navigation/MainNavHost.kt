package com.sample.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument
import com.sample.auth.AuthScreen
import com.sample.drawer.DrawerScreen
import com.sample.navigation.bottombar.BottomNavigationBar

@Composable
fun MainNavHost(
    navController: NavHostController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val context = LocalContext.current

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ){
        NavHost(navController = navController, startDestination = "auth") {
            addAuthScreen(navController = navController, modifier = Modifier.padding(it))
            addDrawerScreen(navController = navController, modifier = Modifier.padding(it))
        }
    }

}

fun NavGraphBuilder.addAuthScreen(navController: NavController, modifier: Modifier) {
    composable(
        route= "auth/{authText}",
        arguments = listOf(navArgument("authText"){ type = NavType.StringType})
    ) {backStackEntry ->
        val text = backStackEntry.arguments?.getString("authText") ?: "Auth Screen"

        AuthScreen(navController = navController, text = text, modifier = modifier)
    }
}

fun NavGraphBuilder.addDrawerScreen(navController: NavController, modifier: Modifier) {
    composable(
        route= "drawer/{drawerText}",
        arguments = listOf(navArgument("drawerText"){ type = NavType.StringType})
    ) {backStackEntry ->
        val text = backStackEntry.arguments?.getString("drawerText") ?: "Drawer Screen"

        DrawerScreen(navController = navController, text = text, modifier = modifier)
    }
}

