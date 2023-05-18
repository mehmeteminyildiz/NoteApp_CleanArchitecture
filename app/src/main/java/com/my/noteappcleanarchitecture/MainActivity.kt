package com.my.noteappcleanarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.my.noteappcleanarchitecture.ui.theme.NoteAppCleanArchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppCleanArchitectureTheme {
                
            }
        }
    }
}

