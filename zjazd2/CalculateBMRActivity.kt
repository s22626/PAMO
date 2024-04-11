package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CalculateBMRActivity : AppCompatActivity() {
    private lateinit var editTextWeight: EditText
    private lateinit var editTextHeight: EditText
    private lateinit var editTextAge: EditText
    private lateinit var radioGroupGender: RadioGroup
    private lateinit var textViewBMRResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmr)

        editTextWeight = findViewById(R.id.editTextWeight)
        editTextHeight = findViewById(R.id.editTextHeight)
        editTextAge = findViewById(R.id.editTextAge)
        radioGroupGender = findViewById(R.id.radioGroupGender)
        textViewBMRResult = findViewById(R.id.textViewBMRResult)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        NavigationUtils.setupBottomNavigation(this, bottomNavigationView)

        val buttonCalculate: Button = findViewById(R.id.buttonCalculate)
        buttonCalculate.setOnClickListener {
            calculateBMR(it)
        }

    }

    fun calculateBMR(view: View) {
        val weightString = editTextWeight.text.toString()
        val heightString = editTextHeight.text.toString()
        val ageString = editTextAge.text.toString()

        if (weightString.isNotEmpty() && heightString.isNotEmpty() && ageString.isNotEmpty()) {
            val weight = weightString.toFloat()
            val height = heightString.toFloat()
            val age = ageString.toInt()

            val radioButtonId = radioGroupGender.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(radioButtonId)
            val gender = if (radioButton.text == "Male") "male" else "female"

            val bmr = calculateBMR(weight, height, age, gender)
            textViewBMRResult.text = "Your BMR: $bmr kcal/day"
        } else {
            textViewBMRResult.text = "Please enter weight, height, and age"
        }
    }

    private fun calculateBMR(weight: Float, height: Float, age: Int, gender: String): Float {
        val bmr: Float
        if (gender == "male") {
            bmr = 66.47f + (13.75f * weight) + (5.003f * height) - (6.755f * age)
        } else {
            bmr = 655.1f + (9.563f * weight) + (1.85f * height) - (4.676f * age)
        }
        return bmr
    }
}
