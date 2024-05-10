/**
 * 1 Exercise
 * Prints the name and age.
 * @param name The name of the person.
 * @param age The age of the person.
 */
fun printNameAndAge(name: String, age: Int) {
    println("$name is $age years old")
}

fun main() {
    val name = "Mary"
    val age = 20
    printNameAndAge(name, age)
}


/**
 * 2 Exercise
 * Main function to declare variables with explicit types.
 */
fun main() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}


/**
 * 3 Exercise
 * Main function to calculate and print the total count of numbers.
 */
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.size + redNumbers.size
    println(totalCount)
}


/**
 * 4 Exercise
 * Main function to check if the requested protocol is supported.
 */
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}


/**
 * 5 Exercise
 * Main function to spell integer numbers from 1 to 3 using a map.
 */
fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}


/**
 * 6 Exercise
 * Using a when expression to print actions based on the input button.
 */
fun main() {
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}


/**
 * 7 Exercise
 * Refactored program using a while loop to count pizza slices until there's a whole pizza with 8 slices.
 */
fun main() {
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

/**
 * Refactored program using a do-while loop to count pizza slices until there's a whole pizza with 8 slices.
 */
fun main() {
    var pizzaSlices = 0
    pizzaSlices++
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}


/**
 * 8 Exercise
 * Program to simulate the Fizz buzz game.
 * Prints numbers from 1 to 100, replacing numbers divisible by three with "fizz", numbers divisible by five with "buzz",
 * and numbers divisible by both three and five with "fizzbuzz".
 */
fun main() {
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> number.toString()
            }
        )
    }
}


/**
 * 9 Exercise
 * Program to print words from a list that start with the letter 'l'.
 */
fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}


/**
 * 10 Exercise
 * Calculates the area of a circle.
 * @param radius The radius of the circle.
 * @return The area of the circle.
 */
import kotlin.math.PI
fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

fun main() {
    println(circleArea(2))
}


