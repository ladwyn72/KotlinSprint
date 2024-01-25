package lesson4

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val isDamaged = readLine()?.toBoolean()

    print("Текущий состав экипажа: ")
    val crew = readLine()!!.toInt()

    print("Количество ящиков с провизией на борту: ")
    val provisions = readLine()!!.toInt()

    print("Благоприятность метеоусловий (true/false): ")
    val isWeatherGood = readLine()?.toBoolean()

    if (isDamaged == true && crew in 55..70 && provisions > 50) {
        println("корабль может отплыть")

    }
    else if (crew == 70 && isWeatherGood == true && provisions >= 50){
        println("корабль может отплыть")
    }
    else{
        println("корабль не может отплыть")
    }


}
