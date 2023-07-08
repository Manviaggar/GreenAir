package com.example.greenair

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greenair.Airqualityregister.RegistationFormOne
import com.example.greenair.Airqualityregister.RegistrationPagetwo
import com.example.greenair.ui.theme.Screen

@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController,
    startDestination = Screen.Home.route){
        composable(route=Screen.Home.route){
            HomePage(navController = navController)
        }
        composable(
            route=Screen.Register.route
        ){
            SignUp(navController=navController)
        }
        composable(route=Screen.Feature.route){
            AllFeatures(navController=navController)
        }
        composable(route=Screen.RegisterOne.route){
            RegistationFormOne(navController=navController)
        }
        composable(route=Screen.RegisterTwo.route){
            RegistrationPagetwo()
        }
    }
}