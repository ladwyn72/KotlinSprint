package lesson_2

import kotlin.math.pow


fun main() {
    val sum = 70000
    val interestRate = 16.7
    val years = 20
    val result = (1 + interestRate / 100).pow(years) * sum
    println(String.format("%.3f", result))

}