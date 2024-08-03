package org.example

fun main() {
    val x = 10 + 5

    var num1 = 10
    var num2 = 20

    // Arithmetic Operators
    var result = num1 + num2
    println(result)
    result = num2 - num1
    println(result)
    result = num1 * 3
    println(result)
    result = num2 / num1
    println(result)
    result = num2 % 3
    println(result)

    // Assignment Operators
    num1 = 5
    println(num1)
    num1 += 3       // num1 = num1 + 3
    println(num1)
    num1 -= 1        // num1 = num1 - 1
    println(num1)
    num1 *= 4       // num1 = num1 * 4
    println(num1)
    num1 /= 2       // num1 = num1 / 2
    println(num1)
    num1 %= 5       // num1 = num1 %5
    println(num1)

    // Comparison Operators
    var res = num1 == num2
    println(res)
    res = num1 != num2
    println(res)
    res = num1 > num2
    println(res)
    res = num1 < num2
    println(res)
    res = num1 >= num2
    println(res)
    res = num1 <= num1
    println(res)

    // Logical Operators
    res = num1 > 5 && num2 < 40
    println(res)
    res = num1 > 5 || num2 < 40
    println(res)
    res = !(num1 > 5)

    // Prefix Increment
    println(++num2) //num2 = num2 + 1, Then print value of num2

    // Prefix Decrement
    println(--num2) // num2 = num2 - 1, Then print value of num2

    //Postfix Increment
    println(num2++)     // Print value of num2, Then num2 = num2 + 1
    println(num2)

    // Postfix Decrement
    println(num2--)     // Print value of num2, Then num2 = num2 -1
    println(num2)
}