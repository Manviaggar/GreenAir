package com.example.greenair.Navigationpackage

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.greenair.Airqualityregister.FourButton
import com.example.greenair.Airqualityregister.LoginFeatures
import com.example.greenair.Airqualityregister.RegistationFormOne
import com.example.greenair.Airqualityregister.RegistrationPagetwo
import com.example.greenair.AllFeatures
import com.example.greenair.HomePage
import com.example.greenair.fourFeaturespagesall.FeatureAirqualitypage
import com.example.greenair.fourFeaturespagesall.LibraryPage
import com.example.greenair.fourFeaturespagesall.Plantdoctor
import com.example.greenair.fourFeaturespagesall.perfectplantfeature
import com.example.greenair.SignUp

@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController,
    startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomePage(navController = navController)
        }
        composable(
            route = Screen.Register.route
        ) {
            SignUp(navController = navController)
        }
        composable(route = Screen.Feature.route) {
            AllFeatures(navController = navController)
        }
        composable(route = Screen.RegisterOne.route) {
            RegistationFormOne(navController = navController)
        }
        composable(route = Screen.RegisterTwo.route) {
            RegistrationPagetwo(navController = navController)
        }
        composable(route = Screen.Loginfeatures.route) {
            LoginFeatures(navController = navController)
        }
        composable(route = Screen.FourFeatureButton.route) {
            FourButton(navController=navController)
        }
        navigation(
            startDestination = Screen.FourFeatureButton.route,
            route= AUTHENTICATION_ROUTE
        ) {

            composable(route = Screen.perfectplantFeature.route) {
                FeatureAirqualitypage()
            }
            composable(route = Screen.AirqualityFeature.route) {
                perfectplantfeature()
            }
            composable(route = Screen.libraryFeature.route) {
                LibraryPage()
            }
            composable(route = Screen.PlantDoctor.route) {
                Plantdoctor()
            }

        }
    }
}