/**
 * 1 Exercise
 * Complete the code to make the program print "Mary is 20 years old" to standard output:
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
 * Explicitly declare the correct type for each variable:
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
 * You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
 */
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.size + redNumbers.size
    println(totalCount)
}


/**
 * 4 Exercise
 * You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol
 * is supported or not (isSupported must be a Boolean value).
 */
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}


/**
 * 5 Exercise
 * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number
 */
fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}


/**
 * 6 Exercise
 * Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
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
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
 * Use a while loop.
 * Use a do-while loop.
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
 * Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word
"fizz", and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
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
 * You have a list of words. Use for and if to print only the words that start with the letter l.
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
 * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle
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


