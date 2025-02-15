package com.ard.counter_arduino

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.ard.counter_arduino.exmaple.SecondFragment

class addFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        val add_button : Button = view.findViewById<Button>(R.id.submitButton1)
        val reset_button : Button = view.findViewById<Button>(R.id.submitButton2)

        add_button.setOnClickListener() {

        }

        reset_button.setOnClickListener() {

        }

        return view
    }
}