package com.example.greenair.Airqualityregister

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.greenair.Navigationpackage.Screen

@Composable
fun FourButton(navController: NavHostController){
    Column(){
        Button(onClick = {
            navController.navigate(Screen.AirqualityFeature.route)
        }) {
            Text("Feature Air Quality")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = {
            navController.navigate(Screen.PlantDoctor.route)
        }) {
            Text("Feature Plant doctor")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(Screen.perfectplantFeature.route) }) {
            Text("Feature find perfect plant")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(Screen.libraryFeature.route) }) {
            Text("Feature plant library")
        }
    }
}
