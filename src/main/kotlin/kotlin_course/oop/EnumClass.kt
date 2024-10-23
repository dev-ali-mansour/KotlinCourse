package kotlin_course.oop

enum class WeatherCondition {
    SUNNY, RAINY, CLOUDY, SNOWY;

    override fun toString(): String =
        when (this) {
            SUNNY -> "Sunny"
            RAINY -> "Rainy"
            CLOUDY -> "Cloudy"
            SNOWY -> "Snowy"
        }
}

enum class UserRole {
    ADMIN, USER, GUEST
}

data class User(
    val firstName: String,
    val lastName: String,
    val username: String,
    val password: String,
    val role: UserRole
)

fun main() {
    val condition = WeatherCondition.SUNNY
    print("It's $condition! ")
    println(getWeatherMessage(condition))

    val user = User(
        firstName = "Ali",
        lastName = "Mansour",
        username = "ali",
        password = "123",
        role = UserRole.ADMIN
    )

    if (user.role == UserRole.ADMIN) {
        println("Home\nAdmin Area\nProfile\nLogout")
    } else if (user.role == UserRole.USER) println("Home\nProfile\nLogout")
    else if (user.role == UserRole.GUEST) println("Register\nLogin")
}

fun getWeatherMessage(condition: WeatherCondition): String =
    when (condition) {
        WeatherCondition.SUNNY -> "Take your hat!"
        WeatherCondition.RAINY -> "Take your umbrella!"
        WeatherCondition.CLOUDY -> "Avoid driving your car!"
        WeatherCondition.SNOWY -> "You can go snowboarding!"
    }