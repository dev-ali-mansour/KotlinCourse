package kotlin_course.functions

fun main() {
    print3()
    println("==================")
    print3()
    nameWithAge("Ali", 36)
    val result = sum(25, 13)
    println(result)
    println("Circle area = ${circleArea(4.16)}")

    println("Result = ${sum3(3, 5, 9)}")

    val number = 36
    println("Square of $number = ${getSquare(number)}")
}

fun print3() {
    println("Hello World!")
    println("Hello World!")
    println("Hello World!")
}

fun circleArea(radius: Double): Double {
    val pi = 3.14
    return 2 * pi * radius * radius
}

fun nameWithAge(name: String, age: Byte): Unit {
    println("$name is $age")
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sum3(num1: Int, num2: Int, num3: Int): Int {
    val res = sum(num1, num2)
    return sum(res, num3)
}

fun getSquare(num: Int): Int = num * num