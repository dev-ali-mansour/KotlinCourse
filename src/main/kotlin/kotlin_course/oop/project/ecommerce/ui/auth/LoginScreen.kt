package kotlin_course.oop.project.ecommerce.ui.authentication

import kotlin_course.oop.project.ecommerce.data.auth.UserManager
import kotlin_course.oop.project.ecommerce.showAuthMenu
import kotlin_course.oop.project.ecommerce.showMainMenu


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
            UserManager.login(username = username, password = password)
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