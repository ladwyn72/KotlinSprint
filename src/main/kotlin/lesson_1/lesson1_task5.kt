package lesson_1

fun main() {
    val secondsCount = 6480

    val minuteCount = secondsCount / 60
    val secondCountRemainder = secondsCount % 60


    val hourCount = minuteCount / 60
    val minuteCountRemainder = minuteCount % 60

    println("Время проведенное в космосе 0$hourCount : $minuteCountRemainder : 0$secondCountRemainder")




}
