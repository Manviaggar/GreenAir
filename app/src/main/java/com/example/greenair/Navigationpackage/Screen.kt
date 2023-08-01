package com.example.greenair.Navigationpackage
const val AUTHENTICATION_ROUTE="authentication"
const val AUTHENTICATION="navigation"
const val ROUTE_ROOT="root"
sealed class Screen(val route:String){
    object Splash:Screen(route="Splash Screen")
    object Home: Screen(route="Home_screen")
    object Register: Screen(route="Register_Screen")
    object Feature: Screen(route="Feature_screen")
    object RegisterOne: Screen(route="Register process One")
    object RegisterTwo: Screen(route="Register process two")
    object Loginfeatures: Screen(route="Login before you start")
    object FourFeatureButton: Screen(route="navigate through our features")
    object AirqualityFeature: Screen(route="navigate to our first feature")
    object perfectplantFeature: Screen(route="navigate to our second feature")
    object PlantDoctor: Screen(route="navigate to our third feature")
    object libraryFeature: Screen(route="navigate to our fourth feature")
    object LoginForApp:Screen(route="navigate to the login page")
}
