package com.bapu.composewithflutter

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import com.bapu.composewithflutter.ui.theme.ComposeWithFlutterTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithFlutterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = { Text(text = "這裡是Native") },
                            )
                        },
                        content = {
                            Main(it)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Main(paddingValues: PaddingValues) {
    Box(
        modifier = Modifier.padding(paddingValues).fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        val context = LocalContext.current
        Button(onClick = {
            startActivity(
                context,
                Intent(context, FlutterActivity::class.java),
                null
            )
        }) {
            Text(text = "啟動 Flutter")
        }
    }
}

