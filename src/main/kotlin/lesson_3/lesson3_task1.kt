package lesson_3

import java.time.LocalTime


fun main() {
    val name = "Тимур"
    val day = "Добрый день"
    val evening = "Доброго вечера"
    val startDate = LocalTime.of(12, 0, 0)
    val timeNow = LocalTime.now()
    if (timeNow < startDate) {
        println("$name $day")
    } else {
        println("$name $evening")
    }


}

