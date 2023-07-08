package com.example.greenair.Airqualityregister

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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
 fun LoginPageAirQuality( navController: NavController){
 Column(

 ){
TextInput(inputtypes = Inputtypes.Name)
     Spacer(modifier=Modifier.padding(10.dp))
     Passwordseeregister("Password")
     Button(onClick = { }){
Text("Start")
     }
 }
 }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(
    inputtypes: Inputtypes
) {
    var value by remember {
        mutableStateOf("")
    }

    TextField(value = value,
        onValueChange = { value =it },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                BorderStroke(1.dp, Color.White),
                shape = RoundedCornerShape(50)
            ),
        leadingIcon = { Icon(imageVector = inputtypes.icon,null, tint = Color.Black) },
        label = { Text(text=inputtypes.label, color = Color.Black) },
        colors= TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        keyboardOptions = inputtypes.keyboardOptions,
        shape = MaterialTheme.shapes.medium
    )
}

sealed class Inputtypes(
    val label:String,
    color: Color,
    val icon: ImageVector,
    val keyboardOptions: KeyboardOptions

) {
    object Name : Inputtypes(
        label = "Username",
        Color.Black,
        icon = Icons.Default.Person,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Passwordseeregister(labelValue:String){

    var password by remember {
        mutableStateOf("")
    }
    val passwordvisible= remember {
        mutableStateOf(false)
    }
    TextField(
        shape = MaterialTheme.shapes.medium,
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
        colors= TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}