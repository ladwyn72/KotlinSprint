package lesson_2

import java.time.LocalTime

fun main() {
    val departureTime = LocalTime.of(9, 39, 0)
    val travelTime: Long = 457
    val arrivalTime = departureTime.plusMinutes(travelTime)
    println(arrivalTime)


}
