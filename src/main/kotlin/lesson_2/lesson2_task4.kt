package lesson_2
fun main (){
    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11
    val buff = 20.0
    val crystalsWithBuff = crystalsWithoutBuff * (1 + buff / 100)
    val ironWithBuff = (1 + buff / 100) * ironWithoutBuff
    println("Бафф кристалов = ${crystalsWithBuff.toInt() - crystalsWithoutBuff}")
    println("Бафф железной руды  = ${ironWithBuff.toInt() - ironWithoutBuff}")


}

