package com.example.greenair.ui.theme

import androidx.annotation.StringRes
import com.example.greenair.R

data class individualfeature(
    val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val subname:Int,
    val Description: Int
)
val features= listOf(
    individualfeature(R.raw.airquality,R.string.airqualityname,R.string.subheadingairquality,R.string.featureairquality) ,
    individualfeature(R.raw.plantdoctor,R.string.plantdoctor,R.string.subheadingperfectplant,R.string.featureplantidentification),
    individualfeature(R.raw.animationhome,R.string.perfectplant,R.string.subheadingperfectplant,R.string.featureperfectplant),
    individualfeature(R.raw.plantlibrary,R.string.plantlibrary,R.string.subheadingplantlibrary,R.string.featurelibrary)

)