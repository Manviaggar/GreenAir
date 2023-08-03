package com.example.greenair.Airqualityregister

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenair.Inputtype
import com.example.greenair.Navigationpackage.Screen
import com.example.greenair.Passwordsee
import com.example.greenair.TextComposable
import com.example.greenair.ui.theme.backgroundforregister
import com.example.greenair.ui.theme.deepgreen

@Composable
fun LoginFeatures(navController: NavController) {
    var username by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box {
        Column(
            modifier = Modifier.fillMaxSize().background(color = backgroundforregister),
            verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            TextComposable(value = "Login")
            TextComposable(value = "Welcome back")
            com.example.greenair.TextInput(inputtype = Inputtype.Email)
            com.example.greenair.TextInput(inputtype = Inputtype.Mobile)
            Passwordsee("Password")
            Divider(
                color = Color.White.copy(alpha = 0.3f),
                thickness = 1.dp,
                modifier = Modifier.padding(top = 150.dp)
            )
            Button(onClick = {
                navController.navigate(Screen.FourFeatureButton.route)},
                colors= ButtonDefaults.buttonColors(deepgreen),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Login", Modifier.padding(vertical = 8.dp))
            }
        }
    }
}
