package com.example.unitconverter

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerConversion: Spinner
    private lateinit var etInputValue: EditText
    private lateinit var btnConvert: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerConversion = findViewById(R.id.spinnerConversion)
        etInputValue = findViewById(R.id.etInputValue)
        btnConvert = findViewById(R.id.btnConvert)
        tvResult = findViewById(R.id.tvResult)

        // Populate the Spinner with conversion options
        val conversions = arrayOf(
            "Kilometers to Miles",
            "Kilograms to Pounds",
            "Meters to Feet"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, conversions)
        spinnerConversion.adapter = adapter

        btnConvert.setOnClickListener {
            val inputStr = etInputValue.text.toString()
            if (inputStr.isNotEmpty()) {
                val inputValue = inputStr.toDouble()
                val selectedConversion = spinnerConversion.selectedItem.toString()

                // Using a reusable conversion function
                val result = performConversion(inputValue, selectedConversion)
                tvResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Reusable function to handle different conversion formulas
    private fun performConversion(value: Double, conversionType: String): Double {
        return when (conversionType) {
            "Kilometers to Miles" -> value * 0.621371
            "Kilograms to Pounds" -> value * 2.20462
            "Meters to Feet" -> value * 3.28084
            else -> 0.0
        }
    }
}