package com.aps.compose_nav.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aps.compose_nav.screen.LoginScreen
import com.aps.compose_nav.screen.SignupScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(route = Screen.Login.route){
            LoginScreen(navController = navHostController)
        }

        composable(route = Screen.SignUp.route){
            SignupScreen(navController = navHostController)
        }
    }
}