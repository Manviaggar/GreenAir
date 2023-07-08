package com.example.greenair.Navigationpackage

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.greenair.Airqualityregister.LoginFeatures
import com.example.greenair.Airqualityregister.RegistationFormOne
import com.example.greenair.Airqualityregister.RegistrationPagetwo
import com.example.greenair.AllFeatures
import com.example.greenair.HomePage
import com.example.greenair.SignUp

fun NavGraphBuilder.homenavgraph(navController: NavHostController){
    composable(route= Screen.Home.route){
        HomePage(navController = navController)
    }
    composable(
        route= Screen.Register.route
    ){
        SignUp(navController=navController)
    }
    composable(route= Screen.Feature.route){
        AllFeatures(navController=navController)
    }
    composable(route= Screen.RegisterOne.route){
        RegistationFormOne(navController=navController)
    }
    composable(route= Screen.RegisterTwo.route){
        RegistrationPagetwo(navController=navController)
    }
    composable(route= Screen.Loginfeatures.route){
        LoginFeatures(navController=navController)
    }
}