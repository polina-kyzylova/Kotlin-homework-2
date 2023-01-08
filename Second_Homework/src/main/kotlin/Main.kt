fun slide30()
{
    var user_str: String
    print("Введите строку: ")
    user_str = readLine()!!

    while (!user_str.equals("Exit", ignoreCase = true))
    {
        print("Введите строку: ")
        user_str = readLine()!!
    }
}

fun slide36()
{
    print("Введите число: ")
    var x: String
    var x_int: Int
    var sum: Int = 0

    x = readLine()!!
    x_int = x.toInt()

    if (x_int >= 0)
    {
        for (i in 0..x_int)
        {
            sum += i
        }
        println("Сумма чисел от 0 до $x_int равна $sum")
    }
    else
    {
        for (i in 0 downTo x_int)
        {
            sum += i
        }
        println("Сумма чисел от $x_int до 0 равна $sum")
    }
}

fun slide45()
{
    print("Введите оценку: ")
    var score_str: String = readLine()!!
    var score_int: Int = score_str.toInt()

    while (score_int > 100 || score_int < 0)
    {
        println("Введено некорректное значение \nПопробуйте снова: ")
        score_str = readLine()!!
        score_int = score_str.toInt()
    }

    if (score_int >= 70)
    {
        println("Супер! Вы прошли тест!")
    } else
    {
        println("К сожалению, вы не прошли тест")
    }
}

fun pult()
{
    print("Введите номер канала: ")
    var num_str: String = readLine()!!
    var num_int: Int = num_str.toInt()

    while (num_int != 0)
    {
        when (num_int) {
            1 -> println("Россия1")
            2 -> println("Animal Planet")
            3 -> println("Disney")
            4 -> println("Nickelodeon")
            5 -> println("2X2")
            else -> println("Такого канала нет")
        }

        print("Перейти на канал: ")
        num_str = readLine()!!
        num_int = num_str.toInt()
    }
}

fun main(args: Array<String>)
{
    println("-----Задание №1-----")
    slide30()

    println("\n-----Задание №2-----")
    slide36()

    println("\n-----Задание №2-----")
    slide45()

    println("\n-----Задание №4-----")
    pult()
}