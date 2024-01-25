package lesson_3

fun main() {
    val string = "D2-D4;0"
    val separatorCharacter1 = "-"
    val separatorCharacter2 = ";"
    val list = string.split(separatorCharacter1,separatorCharacter2)


    val startLocation: String = list[0]
    val endLocation : String = list[1]
    val moveNumber : String = list[2]
    println("откуда $startLocation")
    println("куда $endLocation")
    println("номер хода $moveNumber")


}
