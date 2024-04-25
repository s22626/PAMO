import com.example.myapplication.MainActivity
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class MainActivityTest {

    private lateinit var mainActivity: MainActivity

    @Before
    fun setup() {
        mainActivity = MainActivity()
    }

    @Test
    fun testCalculateBMI() {
        mainActivity.setWeightText("70")
        mainActivity.setHeightText("170")
        //mainActivity.calculateBMI(null)
        Assert.assertEquals("BMI: 24.22\nNormalna waga", mainActivity.getResultText())

        mainActivity.setWeightText("50")
        mainActivity.setHeightText("170")
        //mainActivity.calculateBMI(null)
        Assert.assertEquals("BMI: 17.30\nNiedowaga", mainActivity.getResultText())

        mainActivity.setWeightText("80")
        mainActivity.setHeightText("170")
        //mainActivity.calculateBMI(null)
        Assert.assertEquals("BMI: 27.68\nNadwaga", mainActivity.getResultText())

        mainActivity.setWeightText("100")
        mainActivity.setHeightText("170")
        //mainActivity.calculateBMI(null)
        Assert.assertEquals("BMI: 34.60\nOtyłość", mainActivity.getResultText())

        mainActivity.setWeightText("")
        mainActivity.setHeightText("")
        //mainActivity.calculateBMI(null)
        Assert.assertEquals("Wpisz wagę oraz wzrost!", mainActivity.getResultText())
    }
}
