package com.example.jetpackcomposelearning.ui
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun greet(name:String){
    Text(text="hello  your name is $name")
}

