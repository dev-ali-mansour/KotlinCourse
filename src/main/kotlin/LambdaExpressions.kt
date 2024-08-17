package org.example

fun main() {
    val square = { num: Int -> num * num }
    println(square(3))
    val sum = { num1: Int, num2: Int -> num1 + num2 }
    println(sum(3,5))

    val numbers = listOf(1,2,3,4,5)
    val oddNumbers = numbers.filter { it%2 !=0 }
    println(oddNumbers)
}