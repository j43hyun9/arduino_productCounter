package com.ard.counter_arduino

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_list)


        val preBtn : Button = findViewById(R.id.submitButton_pre)
        val addBtn : Button = findViewById(R.id.submitButton_create)
        preBtn.setOnClickListener() {
            finish()
        }

        preBtn.setOnClickListener() {

            finish()
        }
    }
}