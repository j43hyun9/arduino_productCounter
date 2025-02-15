package com.ard.counter_arduino

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ard.counter_arduino.exmaple.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add : Button = findViewById(R.id.button1)


        add.setOnClickListener() {

            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }


    }
}