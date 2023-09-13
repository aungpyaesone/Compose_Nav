package com.aps.compose_nav.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Box(modifier = Modifier.fillMaxSize().
    background(Color.DarkGray),
        contentAlignment = Alignment.Center) {
        Text(text = "Profile Screen",
            color = Color.White)
    }
}