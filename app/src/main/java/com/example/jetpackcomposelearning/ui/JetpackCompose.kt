package com.example.jetpackcomposelearning.ui
import android.R
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

import androidx.compose.runtime.Composable


//@Composable
//fun ProfileCard(name:String,age:Int,color:Color){
//    Text(text="$name")
//    Text(text="$age")
//    Text(text="${color.toString()}")
//
//}

//---------recompositon
@Composable
fun Greet(name:String)
{
    Text(text="$name")
}


