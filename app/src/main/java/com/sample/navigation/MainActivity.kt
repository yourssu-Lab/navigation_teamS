package com.sample.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.haeti.navigation.NavigationUtil
import com.sample.navigation.ui.theme.Navigation_sample_searchTheme

class MainActivity : ComponentActivity(), NavigationUtil {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            Navigation_sample_searchTheme {
                MainNavHost(navController = navController)
            }
        }
    }

    override fun navigateToAuth(text: String) {
        navController.navigate("auth/$text")
    }

    override fun navigateToDrawer(text: String) {
        navController.navigate("drawer/$text")
    }

    override fun navigateToHome(text: String) {
        navController.navigate("home/$text")
    }
}
