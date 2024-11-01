package kotlin_course.oop

@JvmInline
value class Meter(val value: Double)

fun calculateDistance(meter1: Meter, meter2: Meter): Meter {
    return Meter(meter1.value + meter2.value)
}

@JvmInline
value class Dollar(val amount: Double)

fun calculateTotal(price: Dollar, tax: Dollar): Dollar {
    return Dollar(price.amount + tax.amount)
}

@JvmInline
value class UserId(val id: Int)

fun findUser(userId: UserId) {
    println("Finding user with ID: ${userId.id}")
}

@JvmInline
value class ProductCode(val code: String)

fun checkProductAvailability(productCode: ProductCode) {
    println("Checking availability for product: ${productCode.code}")
}

@JvmInline
value class Celsius(val temperature: Double)

fun convertToFahrenheit(celsius: Celsius): Double = (celsius.temperature * 9 / 5) + 32

fun main() {
    val distance1 = Meter(100.0)
    val distance2 = Meter(50.0)
    val totalDistance = calculateDistance(distance1, distance2)

    println("Total Distance: ${totalDistance.value} meters")

    val price = Dollar(120.0)
    val tax = Dollar(10.0)
    val total = calculateTotal(price, tax)

    println("Total Cost: $${total.amount}")

    val myUserId = UserId(123)
    findUser(myUserId) // Correct usage

    val product = ProductCode("XYZ123")
    checkProductAvailability(product) // Type-safe, without runtime cost

    val temp = Celsius(25.0)
    println("Temperature in Fahrenheit: ${convertToFahrenheit(temp)}")
}
