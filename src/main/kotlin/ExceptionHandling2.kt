package org.example

import java.io.IOException

fun main() {
    val result = runCatching { login("admin", "123456") }
    result.onSuccess { println("Welcome back") }
        .onFailure { println("An error occurred: ${it.message}") }
}

fun login(username: String, password: String): Boolean {
    throw IOException("Server unreachable!")
    return username == "admin" && password == "123456"
}