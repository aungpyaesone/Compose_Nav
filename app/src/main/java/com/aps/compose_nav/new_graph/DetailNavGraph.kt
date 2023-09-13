package com.aps.compose_nav.new_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aps.compose_nav.new_screens.ScreenContent

fun NavGraphBuilder.navDetailGraph(navController: NavController) {
    navigation(
        startDestination = DetailScreen.Information.route,
        route = Graph.DETAILS
    ) {
        composable(route = DetailScreen.Information.route) {
            ScreenContent(name = DetailScreen.Information.route) {
                navController.navigate(DetailScreen.Overview.route)
            }
        }
        composable(route = DetailScreen.Overview.route) {
            ScreenContent(DetailScreen.Overview.route){
                navController.popBackStack(
                    route = DetailScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailScreen(val route: String) {
    object Information : DetailScreen("information")
    object Overview : DetailScreen("over_view")
}