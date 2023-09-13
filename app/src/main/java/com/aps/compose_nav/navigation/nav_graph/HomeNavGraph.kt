package com.aps.compose_nav.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.aps.compose_nav.screen.DetailScreen
import com.aps.compose_nav.screen.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController)
        }
        composable(route = Screen.Detail.route,
        arguments = listOf(
            navArgument(DETAIL_ARGUMENT_KEY){
                type = NavType.IntType
                defaultValue = 0
            },
            navArgument(DETAIL_ARGUMENT_KEY2){
                type = NavType.StringType
                defaultValue ="Aps"
            }
        )
        ){
            DetailScreen(navController = navController)
        }
    }
}