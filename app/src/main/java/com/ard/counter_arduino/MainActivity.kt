package com.ard.counter_arduino

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ard.counter_arduino.ui.theme.Counter_ArduinoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val add_Product: Button = findViewById(R.id.add_product)
        val list_Product: Button = findViewById(R.id.list_product)
        val delete_Product : Button = findViewById(R.id.delete_product)
        val pre_Button : Button = findViewById(R.id.pre_Button)

        add_Product.setOnClickListener {
            add_Product.visibility = View.GONE
            list_Product.visibility = View.GONE
            delete_Product.visibility = View.GONE
            pre_Button.visibility = View.VISIBLE
        }

        pre_Button.setOnClickListener( {
            add_Product.visibility = View.VISIBLE
            list_Product.visibility = View.VISIBLE
            delete_Product.visibility = View.VISIBLE
            pre_Button.visibility = View.GONE
        })
//        setContent {
//            Counter_ArduinoTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Counter_ArduinoTheme {
        Greeting("Android")
    }
}