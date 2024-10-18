package org.example.kotlin_course.oop.project.ecommerce.data.auth

import org.example.kotlin_course.oop.project.ecommerce.model.User

class AuthenticationException(override val message: String) : Exception()

object UserManager : Authentication {
    private val users = mutableListOf<User>()
    private var currentUser: User? = null

    override fun isAuthenticated(): Boolean = currentUser != null

    override fun register(
        firstName: String, lastName: String, age: Short, email: String, username: String, password: String
    ) {
        val existedUser = users.firstOrNull { it.username == username }
        existedUser?.let {
            throw AuthenticationException(message = "User already exists! please try to login")
        } ?: run {
            val user = User(
                firstName = firstName,
                lastName = lastName,
                age = age,
                email = email,
                username = username,
                password = password
            )
            users.add(user)
        }
    }

    override fun login(username: String, password: String) {
        if (username.isBlank()) throw AuthenticationException("Please enter your username!")
        if (password.length < 6) throw AuthenticationException("Please enter at least 6 characters password!")
        val existedUser = users.firstOrNull { it.username == username && it.password == password }
        existedUser?.let { user ->
            currentUser = user
        } ?: throw AuthenticationException("Invalid username or password! Please try again")
    }

    override fun getFullName(): String = currentUser?.let { user ->
        "${user.firstName} ${user.lastName}"
    } ?: "N/A"

    override fun logout() {
        currentUser = null
    }
}