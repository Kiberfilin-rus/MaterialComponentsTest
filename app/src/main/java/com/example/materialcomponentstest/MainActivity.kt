package com.example.materialcomponentstest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_NO
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import com.example.materialcomponentstest.ui.theme.MaterialComponentsTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialComponentsTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Test(innerPadding)
                }
            }
        }
    }
}

@Composable
private fun Test(innerPadding: PaddingValues) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(innerPadding)
    ) {
        Example2()
    }
}

@Composable
fun Example2() {
    TextField(
        value = "Value",
        onValueChange = {},
        label = {Text(text = "Label")}
    )
}

@Composable
fun Example1() {
    OutlinedButton(onClick = {}) {
        Text("Hello World")
    }
}

@Preview(name = "Test Light Mode", showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Preview(name = "Test Dark Mode", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ShowTest() {
    MaterialComponentsTestTheme() {
        Test(PaddingValues.Zero)
    }
}