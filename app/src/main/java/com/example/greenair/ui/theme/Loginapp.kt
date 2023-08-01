package com.example.greenair.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.greenair.Inputtype
import com.example.greenair.Navigationpackage.Screen
import com.example.greenair.Passwordsee
import com.example.greenair.TextComposable
import com.example.greenair.TextInput

@Composable
fun LoginForapp(navController: NavController){
    var username by remember{
        mutableStateOf("")
    }
    var email by remember{
        mutableStateOf("")
    }
    var password by remember{
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize())
    {
       Column (
           modifier= Modifier
               .padding(16.dp)
               .align(Alignment.Center),
           verticalArrangement = Arrangement.spacedBy(16.dp)
       ){
           TextComposable(value = "Login")
           TextComposable(value = "Welcome back")
           TextInput(inputtype = Inputtype.Email)
           TextInput(inputtype = Inputtype.Mobile)
           Passwordsee("Password")
           Divider(
               color = Color.White.copy(alpha = 0.3f),
               thickness = 1.dp,
               modifier = Modifier.padding(top = 150.dp)
           )
           Button(
               onClick = {navController.navigate(Screen.Feature.route) },
               modifier = Modifier.fillMaxWidth()
           )
           {
               Text("Login", Modifier.padding(vertical = 8.dp))
           }
       }
    }
}
@Preview
@Composable
fun Previewloginpage(){
    LoginForapp(navController = rememberNavController())
}
