package org.example

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter number: ")
    val num = scanner.nextInt()

    if (num >= 0) println("Positive number")
    else println("Negative number")

    println("Number = $num")

    print("Enter username: ")
    val userName = scanner.nextLine()
    print("Enter password: ")
    val password = scanner.nextLine()

    if (userName == "ali" && password == "123456") {
        println("welcome back $userName")
        println("Home")
        println("Profile")
        println("Logout")
    } else {
        println("Username or password is invalid!")
        println("Forget your password?")
    }

    var semester = 2
    print("Enter score:")
    val score = scanner.nextDouble()

    if (score >= 60) {
        if (score > 100) {
            println("Invalid score!")
        } else {
            println("Passed")
            semester++
            val grade: Char
            if (score >= 90) grade = 'A'
            else if (score >= 80) grade = 'B'
            else if (score >= 70) grade = 'C'
            else grade = 'D'
            println("Grade: $grade")
        }
    } else println("Failed")

    println("Next semester: $semester")

    val result = if (score >= 60) "Success" else "Fail"

    println("Result: $result")
}
