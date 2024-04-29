package com.sample.home

import android.view.LayoutInflater
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {

    AndroidView(factory = { context ->
        LayoutInflater.from(context).inflate(R.layout.fragment_home, null, false)
    }
    )
}
