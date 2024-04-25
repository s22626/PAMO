import androidx.test.espresso.Espresso
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import org.junit.Rule
import org.junit.Test

class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun testCalculateBMI() {
        val mainActivity = activityRule.activity

        Espresso.onView(withId(R.id.editTextWeight)).perform(ViewActions.replaceText("70"))
        Espresso.onView(withId(R.id.editTextHeight)).perform(ViewActions.replaceText("170"))

        Espresso.onView(withId(R.id.buttonCalculate)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.textViewResult)).check(ViewAssertions.matches(ViewMatchers.withText("BMI: 24.22\nNormalna waga")))
    }
}
