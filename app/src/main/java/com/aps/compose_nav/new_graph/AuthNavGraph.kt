package com.aps.compose_nav.new_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aps.compose_nav.new_screens.LoginContent
import com.aps.compose_nav.new_screens.ScreenContent

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        startDestination = AuthScreen.Login.route,
        route = Graph.AUTHENTICATION
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginContent(onClick = {
                navController.navigate(Graph.HOME)
            }, onSignUpClick = {
                navController.navigate(AuthScreen.SignUp.route)
            }) {
                navController.navigate(AuthScreen.Forgot.route)
            }
        }
        composable(route = AuthScreen.SignUp.route) {
           ScreenContent(name = AuthScreen.SignUp.route) {
               
           }
        }
        composable(route = AuthScreen.Forgot.route) {
           ScreenContent(name = AuthScreen.Forgot.route) {
               
           }
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGNUP")
    object Forgot : AuthScreen(route = "FORGOT")
}