package com.example.greenair.Airqualityregister

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenair.Navigationpackage.Screen

@Composable
fun RegistrationPagetwo(navController: NavController){
    var Gender by rememberSaveable {
        mutableStateOf("")
    }
    var GenderError by remember {
        mutableStateOf("")
    }
    var genderhaserror by remember{
        mutableStateOf(false)
    }
    var countrycode by rememberSaveable {
        mutableStateOf("")
    }
    var countryError by remember {
        mutableStateOf("")
    }
    var countryhaserror by remember{
        mutableStateOf(false)
    }
    var countryname by rememberSaveable {
        mutableStateOf("")
    }
    var nameError by remember {
        mutableStateOf("")
    }
    var namehaserror by remember{
        mutableStateOf(false)
    }
    Column(modifier=Modifier.padding(10.dp)) {
            Text("Gender")
            GenderDropDown(Gender)
        if(genderhaserror){
            Text(
                text = GenderError,
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Country Code")
        CountryCode(countrycode)
        if(countryhaserror){
            Text(
                text=countryError,
                color=Color.Red,
                style=MaterialTheme.typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Country")
        DropDownCountry(countryname)
        if(namehaserror){
            Text(
                text=nameError,
                color= Color.Red,
                style=MaterialTheme.typography.bodySmall
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {
when{
    Gender.isEmpty()->{
        genderhaserror=true
        GenderError="This Field is required"
    }
    countrycode.isEmpty()->{
        countryhaserror=true
        countryError="This Field is required"
    }
    countryname.isEmpty()->{
        namehaserror=true
        nameError="this field is required"
    }
}
            navController.navigate(Screen.Loginfeatures.route)

        }) {
            Text(text = "Next")
        }
        Spacer(modifier=Modifier.padding(10.dp))
        Text("Fill all these details for the results")
    }
}

@Preview
@Composable
fun Previewthree(){

}