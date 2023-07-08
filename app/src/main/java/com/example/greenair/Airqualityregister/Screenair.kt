package com.example.greenair.Airqualityregister

sealed class Screenair(val route:String){
    object Registrationone: Screenair(route="Register process one")
    object Registrtiontwo:Screenair(route="Register process two")
    object Login:Screenair(route="Login screen")
}
