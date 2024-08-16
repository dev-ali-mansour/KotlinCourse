package org.example

fun main() {
    var count = 1
    do {
        println("Count  is : $count")
        count++
    } while (count < 5)

    val secretNUmber = (1..10).random()
    count = 1
    do {
        if (count > 1) println("Try again!")
        print("Guess a number: ")
        val guess = readln().toInt()
        count++
    } while (count <= 3 && guess != secretNUmber)

    if (count <= 3) println("Winner!")
    else println("Hard Luck!")
}