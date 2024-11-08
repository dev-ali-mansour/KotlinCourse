package kotlin_course.oop


val User.fullName: String
    get() = "$firstName $lastName"

fun User.generateEmailAddress(): String = "${this.username}@site.com"

val <T> List<T>.lastIndex: Int
    get() = if (this.isEmpty()) 0 else this.size - 1

fun Int.kmToMiles(): Double = this * 0.621371

fun Double.kmToMiles():Double = this * 0.621371

fun <T> MutableList<T>.moveToEnd(item: T) {
    if (this.remove(item)) this.add(item)
}


fun main() {

    val user = User(
        firstName = "Ali",
        lastName = "Mansour",
        username = "ali.mansour",
        password = "132",
        role = UserRole.ADMIN
    )
    println("Full Name: ${user.fullName}") // Full Name: Ali Mansour
    println("EmailAddress: ${user.generateEmailAddress()}") // EmailAddress: ali.mansour@site.com

    val items = listOf("apple", "banana", "cherry")
    println(items.lastIndex) // 2

    val distanceInKm = 5
    println("$distanceInKm km is ${distanceInKm.kmToMiles()} miles") // 5 km is 3.106855 miles

    val distanceInKm2 = 6.25
    println("$distanceInKm2 km is ${distanceInKm2.kmToMiles()} miles") // 6.25 km is 3.8835687500000002 miles

    val list = mutableListOf("a", "b", "c", "a")
    list.moveToEnd("b")
    println(list) // [a, c, a, b]
}