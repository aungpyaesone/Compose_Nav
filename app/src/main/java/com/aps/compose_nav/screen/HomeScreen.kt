package com.aps.compose_nav.screen

import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aps.compose_nav.navigation.nav_graph.AUTH_GRAPH_ROUTE
import com.aps.compose_nav.navigation.nav_graph.Screen


@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home", modifier = Modifier.clickable {
            navController.navigate(
                route = Screen.Detail.passNameAndId(
                    id = 11,
                    name = "aung pyae sone"
                )
            )
        },
        color = MaterialTheme.colorScheme.primary,
        fontSize = MaterialTheme.typography.headlineMedium.fontSize,
        fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier = Modifier.clickable {
            navController.navigate(AUTH_GRAPH_ROUTE)
        }, text = "Login/Signup",
        fontSize = MaterialTheme.typography.headlineMedium.fontSize,
        fontWeight = FontWeight.Normal)

    }
    /* Box(modifier = Modifier.fillMaxSize().
         background(Color.Blue),
         contentAlignment = Alignment.Center) {
         Text(text = "Home Screen",
         color = Color.White)
     }*/
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
 HomeScreen(navController = rememberNavController())
}