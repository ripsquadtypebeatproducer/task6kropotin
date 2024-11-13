fun main() {
    println("Введите первое число:")
    val digit1 = readlnOrNull() ?: return
    println("Введите второе число:")
    val digit2 = readlnOrNull() ?: return

    if (digit1.length == 1 && digit2.length == 1 && digit1 != digit2) {
        val oddNumber1 = digit1 + digit2
        val oddNumber2 = digit2 + digit1

        if (digit1.toInt() % 2 != 0) {
            println("нечетное число: $oddNumber1")
        } else if (digit2.toInt() % 2 != 0) {
            println("нечетное число: $oddNumber2")
        } else {
            println("Ошибка.")
        }
    } else {
        println("Введите не одинаковые числа.")
    }
}