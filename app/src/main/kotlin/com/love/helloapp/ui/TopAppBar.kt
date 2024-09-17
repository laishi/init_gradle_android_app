package com.love.helloapp.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {
    TopAppBar(
        colors = topAppBarColors(
            containerColor = Color(0xFF6200EE), // Custom color
            titleContentColor = Color.White, // Custom color
        ),
        title = {
            Text("Top app bar")
        }
    )
}

