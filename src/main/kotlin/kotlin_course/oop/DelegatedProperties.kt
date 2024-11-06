package kotlin_course.oop

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class UserProfile {
    val username: String by lazy {
        println("Computing username...")
        "alimansour76"
    }
}

class ScoreBoard {
    var score: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}

class Subject {
    var highScore: Int by Delegates.vetoable(0) { _, old, new ->
        new >= old  // Only accept new score if it’s not lower than current score
    }
}

class Profile(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class Student {
    var id: Int by Delegates.notNull()

    fun initializeUser(id: Int) {
        this.id = id
    }
}

class AccessLoggerDelegate<T>(private var value: T) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("Accessing '${property.name}' with value: $value")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T) {
        println("Updating '${property.name}' from $value to $newValue")
        value = newValue
    }
}

class Worker {
    var name: String by AccessLoggerDelegate("Unknown")
}

fun main() {
    val user = UserProfile()
    println(user.username) // First access, triggers computation
    println(user.username) // Subsequent access, uses cached value

    val board = ScoreBoard()
    board.score = 10
    board.score = 20

    val subject = Subject()
    println("Initial score: ${subject.highScore}")
    subject.highScore = 50 // Score updated
    println("Updated score: ${subject.highScore}")
    subject.highScore = 40 // Rejected
    println("Final score: ${subject.highScore}")

    val data = mapOf(
        "name" to "Aly", "age" to 28
    )
    val profile = Profile(data)
    println("Name: ${profile.name}")
    println("Age: ${profile.age}")

    val student = Student()
    student.initializeUser(12345)
    println("Student ID: ${student.id}")

    val worker = Worker()
    println(worker.name)
    worker.name = "Ahmed"
    println(worker.name)

}
