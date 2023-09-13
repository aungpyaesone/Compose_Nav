package com.aps.compose_nav.navigation.nav_graph


const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}&name={name}"){
        fun passNameAndId(
            id: Int = 0,
            name : String = "APS"
        ): String{
            return "detail_screen?id=$id&name=$name"
        }
    }
    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")
}