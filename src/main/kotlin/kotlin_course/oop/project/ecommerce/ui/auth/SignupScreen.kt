package org.example.kotlin_course.oop.project.ecommerce.ui.authentication

import org.example.kotlin_course.oop.project.ecommerce.data.auth.UserManager


fun register() {
    println("###################")
    println("Registration Screen")
    println("###################")
    var firstName: String
    var lastName: String
    var age: Short = 0
    var email: String
    var username: String
    var password: String

    var repeat = true
    while (repeat) {
        runCatching {
            while (true) {
                print("First Name: ")
                firstName = readln()
                if (firstName.isBlank()) println("Please enter your first name!")
                else break
            }
            while (true) {
                print("Last Name: ")
                lastName = readln()
                if (lastName.isBlank()) println("Please enter your last name!")
                else break
            }
            var inValidAge = true
            while (inValidAge) {
                runCatching {
                    print("Age: ")
                    age = readln().toShort()
                    if (age < 16) throw Exception()
                    inValidAge = false
                }.onFailure { println("Please enter a valid age!") }
            }
            while (true) {
                print("Email Address: ")
                email = readln()
                if (email.isBlank()) println("Please enter your email address!")
                else break
            }
            while (true) {
                print("Username: ")
                username = readln()
                if (username.isBlank()) println("Please enter your username!")
                else break
            }
            while (true) {
                print("Password: ")
                password = readln()
                if (password.length < 6) println("Please enter at least 6 characters password!")
                else break
            }

            val userManager = UserManager
            userManager.register(
                firstName = firstName,
                lastName = lastName,
                age = age,
                email = email,
                username = username,
                password = password
            )
            repeat = false
            println("Your account have been registered successfully! You can login now")
            login()
        }.onFailure { error ->
            println("Registration Error: ${error.message}")
        }
    }
}