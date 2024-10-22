package kotlin_course.conditions

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter month number:")
    val month = scanner.nextInt()

    when (month) {
        1 -> {
            println("January")
            println("First Month")
        }

        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> {
            println("December")
            println("Last Month")
        }

        else -> {
            println("Invalid")
            println("Try again!")
        }
    }

    when (month) {
        12, 1, 2 -> println("Winter")
        3, 4, 5 -> println("Spring")
        6, 7, 8 -> println("Summer")
        9, 10, 11 -> println("Fall")
    }

    val season = when (month) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Fall"
        else -> "Invalid"
    }

    println("You choose a month in $season")
}