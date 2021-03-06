package com.example.semesterproject.screens

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun SettingView (){
    val openAlert =remember{ mutableStateOf(false)}
    Button(
        onClick = {
            openAlert.value = true;
        }
    ) {
        Text(text = "Delete My High Scores")
    }
    if(openAlert.value){
        AlertDialog(
            onDismissRequest = { openAlert.value = false },
            title = { Text(text = "Alert Dialog")},
            text = { Text(text = "Are you sure you want to permanently delete your scores?")},
            confirmButton = {
                Button(onClick = { openAlert.value = false }) {
                    Text(text = "Confirm") }
                }
                ,
            dismissButton = {
                Button(onClick = { openAlert.value = false }) {
                Text(text = "Dismiss")
                }
            }
        )
    }
    //TODO-add setting for dark/light mode
}
