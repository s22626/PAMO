package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculateBMRActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(CalculateBMRActivity::class.java)

    @Test
    fun testCalculateBMR_male() {

        onView(withId(R.id.navigation_calculate_bmr)).perform(click())
        val weight = 70f
        val height = 170f
        val age = 30
        val gender = "male"

        val expectedResult = 66.47f + (13.75f * weight) + (5.003f * height) - (6.755f * age)
        val calculatedBMR = CalculateBMRActivity().calculateBMR(weight, height, age, gender)

        Assert.assertEquals(expectedResult, calculatedBMR, 0.01f)
    }

    @Test
    fun testCalculateBMR_female() {

        onView(withId(R.id.navigation_calculate_bmr)).perform(click())
        val weight = 60f
        val height = 160f
        val age = 25
        val gender = "female"

        val expectedResult = 655.1f + (9.563f * weight) + (1.85f * height) - (4.676f * age)
        val calculatedBMR = CalculateBMRActivity().calculateBMR(weight, height, age, gender)

        Assert.assertEquals(expectedResult, calculatedBMR, 0.01f)
    }
}