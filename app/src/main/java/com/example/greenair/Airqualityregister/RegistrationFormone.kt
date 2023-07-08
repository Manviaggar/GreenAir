@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.greenair.Airqualityregister

import android.util.Patterns
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenair.ui.theme.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistationFormOne(navController: NavController) {
    var phonenumber by rememberSaveable {
        mutableStateOf("")
    }
var phonenumberhaserror by rememberSaveable {
    mutableStateOf(false)
}
    var phonenumbererror by rememberSaveable {
        mutableStateOf("")
    }
        var email by rememberSaveable {
            mutableStateOf("")
        }
        var firstname by rememberSaveable {
            mutableStateOf("")
        }
        var lastname by rememberSaveable {
            mutableStateOf("")
        }
        var firstnameError by remember {
            mutableStateOf("")
        }
        var firstnamehaserror by remember {
            mutableStateOf(false)
        }
        var lastnameError by remember {
            mutableStateOf("")
        }
        var lastnamehaserror by remember {
            mutableStateOf(false)
        }

        var emailError by remember {
            mutableStateOf("")
        }
        var emailhaserror by remember {
            mutableStateOf(false)
        }
    var City by rememberSaveable {
        mutableStateOf("")
    }
    var CityError by remember {
        mutableStateOf("")
    }
    var Cityhaserror by remember {
        mutableStateOf(false)
    }
    var Street by rememberSaveable {
        mutableStateOf("")
    }
    var StreetError by remember {
        mutableStateOf("")
    }
    var Streethaserror by remember {
        mutableStateOf(false)
    }
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = "Email")
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
            )

            if (emailhaserror) {
                Text(
                    text = emailError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text("First Name")
            OutlinedTextField(
                value = firstname,
                onValueChange = { firstname = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
            )
            if (firstnamehaserror) {
                Text(
                    text = firstnameError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text("Last Name")
            OutlinedTextField(
                value = lastname,
                onValueChange = { lastname = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
            )
            if (lastnamehaserror) {
                Text(
                    text = lastnameError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text("Phone number")
            OutlinedTextField(

                value = phonenumber,
                onValueChange = { phonenumber = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next, keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
            )
            if(phonenumberhaserror){
                Text(
                    text =phonenumbererror,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text("City")
            OutlinedTextField(
                value = City,
                onValueChange = { City = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
                singleLine = true
            )
            if(Cityhaserror){
                Text(
                    text =CityError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }

            Spacer(modifier = Modifier.padding(20.dp))
            Text(text = "Street")
            OutlinedTextField(
                value = Street,
                onValueChange = { Street = it },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
                ),
            )

            if (Streethaserror) {
                Text(
                    text = StreetError,
                    color = Color.Red,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Button(onClick = {
                when {
                    email.isEmpty() -> {
                        emailhaserror = true
                        emailError = "This field is required"
                    }

                    !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                        emailhaserror = true
                        emailError = "Invalid Email address"
                    }

                    firstname.isEmpty() -> {
                        firstnamehaserror = true
                        firstnameError = "This field is required"
                    }

                    lastname.isEmpty() -> {
                        lastnamehaserror = true
                        firstnameError = "This field is required"
                    }

                    phonenumber.isEmpty() -> {
                        phonenumberhaserror = true
                        phonenumbererror = "This field is required"
                    }

                    City.isEmpty() -> {
                        Cityhaserror = true
                        CityError = "This field is required"
                    }

                    Street.isEmpty() -> {
                        Streethaserror = true
                        StreetError = "This field is required"
                    }

                }
                if(Streethaserror==false) {
                navController.navigate(Screen.RegisterTwo.route)
            }

            }) {
                Text(text = "Next")
            }
            Text("Fill all these details for the results")
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Passwordseere(labelValue:String){

    var password by remember {
        mutableStateOf("")
    }
    val passwordvisible= remember {
        mutableStateOf(false)
    }
    TextField(
        value = password,
        onValueChange = {
            password =it },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                BorderStroke(1.dp, Color.White),
                shape = RoundedCornerShape(50)
            ),
        leadingIcon = { Icon(imageVector = Icons.Default.Lock,null, tint = Color.Black) },
        trailingIcon = {
            val iconImage=if(passwordvisible.value){
                Icons.Filled.Visibility
            }else
            {
                Icons.Filled.VisibilityOff
            }
            var description =if(passwordvisible.value){
                "Hide password"
            }
            else{
                "Show password"
            }
            IconButton(
                onClick={ passwordvisible.value=!passwordvisible.value}
            ){
                Icon(imageVector = iconImage,contentDescription = description)
            }

        },
        visualTransformation = if(passwordvisible.value) VisualTransformation.None else
            PasswordVisualTransformation(),
        label = { Text(text=labelValue, color = Color.Black) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.onPrimary,
            unfocusedBorderColor = MaterialTheme.colorScheme.onPrimary
        ),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

