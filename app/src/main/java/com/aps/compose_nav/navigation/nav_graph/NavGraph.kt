package com.aps.compose_nav.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController,
        startDestination = HOME_GRAPH_ROUTE,
    route = ROOT_GRAPH_ROUTE){
        authNavGraph(navHostController = navHostController)
        homeNavGraph(navController = navHostController)
    }
}