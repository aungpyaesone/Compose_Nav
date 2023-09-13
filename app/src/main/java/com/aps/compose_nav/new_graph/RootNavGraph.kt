package com.aps.compose_nav.new_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aps.compose_nav.new_screens.NewHomeScreen


object Graph{
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "detail_graph"
}

@Composable
fun RootNavGraph(navHostController: NavHostController){
    NavHost(
        navController = navHostController,
        startDestination = Graph.AUTHENTICATION,
        route = Graph.ROOT
    ){
        authNavGraph(navHostController)
        composable(route = Graph.HOME){
            NewHomeScreen()
        }
    }
}