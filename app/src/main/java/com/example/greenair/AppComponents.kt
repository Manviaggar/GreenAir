package com.example.greenair

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.AlertDialogDefaults.shape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenair.ui.theme.heading

@Composable
fun TextComposable(value :String){
    Text(
        text=value,
        modifier= Modifier
            .fillMaxWidth()
            .heightIn(min = 35.dp),
        style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color= colorResource(id = R.color.white),
        textAlign = TextAlign.Center
    )

}
@Composable
fun HeadingText(value :String){
    Text(
        text=value,
        modifier= Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp),
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color= heading,
        textAlign = TextAlign.Center
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(
    inputtype: Inputtype
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
        leadingIcon = { Icon(imageVector = inputtype.icon,null, tint = Color.Black) },
        label = { Text(text=inputtype.label, color = Color.Black) },
        colors= TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        keyboardOptions = inputtype.keyboardOptions,
        shape = MaterialTheme.shapes.medium
    )
}
sealed class Inputtype(
    val label:String,
    color: Color,
    val icon: ImageVector,
    val keyboardOptions: KeyboardOptions

){
    object Name:Inputtype(
        label="Username",
        Color.Black,
        icon= Icons.Default.Person,
        keyboardOptions = KeyboardOptions(imeAction= ImeAction.Next),
    )
    object Email:Inputtype(
        label="Email",
        Color.Black,
        icon= Icons.Default.Email,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),

        )
    object Mobile:Inputtype(
        label="Mobile Number",
        Color.Black,
        icon= Icons.Default.Phone,
        keyboardOptions = KeyboardOptions(imeAction= ImeAction.Next),

        )

    object Password:Inputtype(
        label="Password",
        Color.Black,
        icon= Icons.Default.Lock,
        keyboardOptions= KeyboardOptions(imeAction= ImeAction.Done, keyboardType = KeyboardType.Password),

        )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Passwordsee(labelValue:String){

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


@Composable
fun CheckBoxfunc(value:String){
    Row(modifier= Modifier
        .fillMaxWidth()
        .heightIn(56.dp),
        verticalAlignment = Alignment.CenterVertically){

        ClickableTextComponent(value=value)
    }
}
@Composable
fun ClickableTextComponent(value:String){
    val initialtext="By continuing you accept our"
    val privacypolicyText=" Privacy Policy"
    val andText=" and"
    val terms=" Terms of Use"

    val annotatedString= buildAnnotatedString {
        append(initialtext)
        withStyle(style= SpanStyle(color= Color.Black)){
            pushStringAnnotation(tag=privacypolicyText, annotation = privacypolicyText)
            append(privacypolicyText)
        }
        append(andText)
        withStyle(style= SpanStyle(color= Color.Black)){
            pushStringAnnotation(tag=terms, annotation = terms)
            append(terms)
        }

    }
    ClickableText(text = annotatedString, onClick ={ offset->
        annotatedString.getStringAnnotations(offset,offset)
            .firstOrNull()?.also{span->
                Log.d("ClickableTextComponent","{$span}")
            }
    } )
}