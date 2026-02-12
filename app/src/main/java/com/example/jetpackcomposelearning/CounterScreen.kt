package com.example.jetpackcomposelearning

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun CounterScree() {

    var count by remember{ mutableStateOf( value=0) }

    Text(text="asdf\nasdf\nasdf\nasdf")
    Text(text="counter is $count")

    Button(onClick={
        count=count+1 //+1
    }){
        Text(text="incresase")

    }

}