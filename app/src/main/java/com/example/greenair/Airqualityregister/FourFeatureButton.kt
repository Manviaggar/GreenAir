package com.example.greenair.Airqualityregister

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.greenair.Navigationpackage.Screen
import com.example.greenair.ui.theme.buttoncolorj

@Composable
fun FourButton(navController: NavHostController){
    Column(
        modifier=Modifier
            .fillMaxWidth()
            .background(buttoncolorj)
            .fillMaxHeight(),
      verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {
            navController.navigate(Screen.AirqualityFeature.route)
        }) {
            Text("     Breathe Easy: Real time Air Insights   ")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = {
            navController.navigate(Screen.PlantDoctor.route)
        }
        ) {
            Text("        Plant Doctor: Diagnose & Identify       ")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(Screen.perfectplantFeature.route) }) {
            Text("Home Green Home: Find Your Plant Match")
        }
        Spacer(modifier= Modifier.padding(10.dp))
        Button(onClick = { navController.navigate(Screen.libraryFeature.route) }) {
            Text("Plant Library: Plant Exploration Made Easy")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Previewbutton(){
    FourButton(navController = rememberNavController())
}
