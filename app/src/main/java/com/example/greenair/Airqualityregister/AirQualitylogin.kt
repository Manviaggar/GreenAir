package com.example.greenair.Airqualityregister

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.greenair.Navigationpackage.Screen

@Composable
fun LoginFeatures(navController: NavController) {
    Column() {
        Text("Login")
        Button(onClick = {
            navController.navigate(Screen.FourFeatureButton.route)
        }) {
            Text("Start")
        }
    }
}
