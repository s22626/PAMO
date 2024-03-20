package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editTextWeight: EditText
    private lateinit var editTextHeight: EditText
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextWeight = findViewById(R.id.editTextWeight)
        editTextHeight = findViewById(R.id.editTextHeight)
        textViewResult = findViewById(R.id.textViewResult)
    }

    fun calculateBMI(view: View) {
        val weightString = editTextWeight.text.toString()
        val heightString = editTextHeight.text.toString()

        if (weightString.isNotEmpty() && heightString.isNotEmpty()) {
            val weight = weightString.toFloat()
            val height = heightString.toFloat() / 100 // Convert height to meters

            val bmi = weight / (height * height)

            val bmiResult = when {
                bmi < 18.5 -> "Niedowaga"
                bmi >= 18.5 && bmi < 25 -> "Normalna waga"
                bmi >= 25 && bmi < 30 -> "Nadwaga"
                else -> "Otyłość"
            }

            val resultText = "BMI: %.2f\n%s".format(bmi, bmiResult)
            textViewResult.text = resultText
        } else {
            textViewResult.text = "Wpisz wagę oraz wzrost!"
        }
    }
}
