package org.example.kotlin_course.oop.project.ecommerce


fun login() {
    println("#############")
    println("Login Screen")
    println("#############")
    var repeat = true
    var username: String
    var password: String

    while (repeat) {
        runCatching {
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
            userManager.login(username = username, password = password)
            repeat = false
            showMainMenu(userManager)
        }.onFailure { error ->
            println("Login Error: ${error.message}")
            print("Go back to the main menu? Y = Yes: ")
            val choice = readln().first()
            if (choice.lowercaseChar() == 'y') {
                repeat = false
                showAuthMenu()
            }
        }
    }
}