package org.example

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    /*print("Please enter your name: ")
    val name = scanner.nextLine()
    println("Welcome back $name")*/

    /*println("Account Registration")
    print("First Name: ")
    val firstName = scanner.nextLine()
    print("Last Name: ")
    val lastName = scanner.nextLine()
    print("Email Address: ")
    val email = scanner.nextLine()
    print("Age: ")
    val age = scanner.nextByte()
    print("Gender (M for male, F for female): ")
    val gender = scanner.next().single()
    scanner.nextLine()
    print("Password: ")
    val password = scanner.nextLine()

    println("Your account has been created successfully!")
    println("Full Name: $firstName $lastName")
    println("Email Address: $email")
    println("You are $age years old, and your gender is $gender")*/

    val pi = 3.14
    println("Enter circle radius: ")
    val radius = scanner.nextDouble()
    val area = 2 * pi * radius * radius
    println("Circle Area = $area")

}