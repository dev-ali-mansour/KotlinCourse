package org.example

import java.util.Scanner

fun main() {
    for (item in 1..3) {
        println("Hello World!")
    }

    for (item in 1..10)
        println(item)

    for (item in 1..10 step 2)
        println(item)

    for (item in 1 until 10)
        println(item)

    for (item in 1 until 10 step 3) println(item)

    for (item in 10 downTo 1) println(item)

    for (item in 10 downTo 1 step 2) println(item)

    for (x in 1..5) {
        for (y in 1..5) {
            println("($x, $y)")
        }
    }

    for (line in 1..5) {
        for (count in 1..line) {
            print("*")
        }
        println()
    }

    for (item in 1..10) {
        if (item % 2 == 0) continue
        println(item)
    }

    for (item in 1..10) {
        if (item > 5) break
        println(item)
    }

    val scanner = Scanner(System.`in`)

    print("Enter number: ")
    val num = scanner.nextInt()

    var factorial: Int = 1
    for (item in num downTo 1) {
        factorial *= item
    }

    println("Factorial of $num = $factorial")

}