package kotlin_course.oop.project.ecommerce.data.auth

interface Authentication {

    fun isAuthenticated():Boolean

    fun register(
        firstName: String,
        lastName: String,
        age: Short,
        email: String,
        username: String,
        password: String
    )

    fun login(
        username: String,
        password: String
    )

    fun getFullName():String

    fun logout()
}