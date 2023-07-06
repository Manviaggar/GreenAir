package com.example.greenair.ui.theme

sealed class Screen(val route:String){
    object Home: Screen(route="Home_screen")
    object Register:Screen(route="Register_Screen")
    object Feature:Screen(route="Feature_screen")
}
