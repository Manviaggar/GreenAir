package com.example.greenair

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenair.Navigationpackage.Screen
import com.google.accompanist.insets.ProvideWindowInsets

@SuppressLint("ResourceType")
@Composable
fun SignUp(navController: NavController)
{
    val image= painterResource(id = R.drawable.backk)
    ProvideWindowInsets {
        Box{
            Image(painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha=0.8F,
                modifier = Modifier
                    .fillMaxSize()
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextComposable(value = "Register")
                HeadingText(value = "Create a new account")
                TextInput(inputtype = Inputtype.Name)
                TextInput(inputtype = Inputtype.Email)
                TextInput(inputtype = Inputtype.Mobile)
                Passwordsee("Password")
                CheckBoxfunc("By Registering you accept our Privacy Policy and Terms of Use")
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
                    Text("Register", Modifier.padding(vertical = 8.dp))
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Already have an account", color = Color.White)
                    TextButton(onClick = { }) {
                        Text(text = "SIGN IN")
                    }
                }
            }
        }


    }
}
