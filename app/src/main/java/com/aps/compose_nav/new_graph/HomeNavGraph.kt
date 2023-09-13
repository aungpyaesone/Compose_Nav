package com.aps.compose_nav.new_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aps.compose_nav.new_screens.BottomBarScreen
import com.aps.compose_nav.new_screens.ScreenContent

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
        route = Graph.HOME
    ) {
        composable(route = BottomBarScreen.Home.route){
            ScreenContent(name = BottomBarScreen.Home.route) {
                navController.navigate(Graph.DETAILS)
            }
        }
        composable(route = BottomBarScreen.Profile.route){
            ScreenContent(name = BottomBarScreen.Profile.route) {
            }
        }
        composable(route = BottomBarScreen.Setting.route){
            ScreenContent(name = BottomBarScreen.Setting.route) {
            }
        }
        navDetailGraph(navController)
    }
}