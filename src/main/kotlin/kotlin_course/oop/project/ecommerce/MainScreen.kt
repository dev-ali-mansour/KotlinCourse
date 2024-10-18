package org.example.kotlin_course.oop.project.ecommerce

import org.example.kotlin_course.oop.project.ecommerce.data.auth.UserManager
import org.example.kotlin_course.oop.project.ecommerce.ui.authentication.login
import org.example.kotlin_course.oop.project.ecommerce.ui.authentication.register
import org.example.kotlin_course.oop.project.ecommerce.ui.order.showProducts
import kotlin.system.exitProcess

fun showMainScreen() {
    val userManager = UserManager
    if (userManager.isAuthenticated()) showMainMenu(userManager)
    else showAuthMenu()
}

fun showMainMenu(userManager: UserManager) {
    println("###########")
    println("Main Screen")
    println("###########")
    println("Welcome back ${userManager.getFullName()}")
    println("Choose an action:")
    println("1) Show products")
    println("2) Logout")
    var repeat = true
    while (repeat) {
        val choice = readln().toInt()
        when (choice) {
            1 -> {
                showProducts()
                repeat = false
            }

            2 -> {
                userManager.logout()
                showMainScreen()
                repeat = false
            }

            else -> println("Invalid choice! try again")
        }
    }
}

fun showAuthMenu() {
    var repeat = true
    while (repeat) {
        runCatching {
            println("Choose an action")
            println("1) Sign up")
            println("2) Login")
            println("3) Exit")
            val choice = readln().toInt()
            when (choice) {
                1 -> {
                    register()
                    repeat = false
                }

                2 -> {
                    login()
                    repeat = false
                }

                3 -> {
                    println("System Exit. Bye!")
                    exitProcess(0)
                }

                else -> println("Invalid choice! try again")
            }
        }.onFailure { error -> println("Invalid Choice! ${error.message}") }
    }
}