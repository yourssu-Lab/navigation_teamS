package com.sample.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sample.home.HomeEx
import com.sample.navigation.ui.theme.Navigation_sample_searchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation_sample_searchTheme {
                HomeEx()
            }
        }
    }
}
