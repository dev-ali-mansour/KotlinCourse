package kotlin_course.oop

data class Box<T>(val length: T, val width: T)

fun <T> printItems(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

fun <K, V> mapItems(map: Map<K, V>) {
    println(map)
}


fun main() {
    val box = Box<Double>(length = 3.5, width = 5.4)
    println(box)

    printItems<Short>(listOf(3, 4, 5, 6))
    //printItems<Double>(listOf(3,4,5,6)) // CTE
    printItems<Double>(listOf(1.2, 8.4, 5.6))
    printItems<String>(listOf("Ali", "Saber", "Mohamed"))

    mapItems<String, Int>(mapOf(Pair("Ali", 38), Pair("Saber", 40)))

    val objects = mutableListOf<Any>()
    val users = mutableListOf<User>()
    objects.add("Ali")
    objects.add(15)
    objects.add(19.25)

    //users.add("Ali") // CTE
    val user = User(
        firstName = "Ali",
        lastName = "Mansour",
        username = "ali",
        password = "123",
        role = UserRole.ADMIN
    )
    users.add(user)

    println("Objects: $objects")
    println("Users: $users")
}