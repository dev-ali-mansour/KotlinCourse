package kotlin_course.oop

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b;
    }

    fun add(a: Int, b: Int, c: Int): Int {
//        return a + b + c
        return add(a, add(b, c))
    }

    fun add(a: Double, b: Double): Double {
        return a + b;
    }
}

open class Vehicle {
    open val brand = "Unkonwn"

    open fun drive() {
        println("The vehicle is moving")
    }
}

class Car : Vehicle() {
    override val brand: String = "Toyota"

    override fun drive() {
        super.drive()
        println("The car is moving smoothly")
    }
}

fun main() {
//    val calc = Calculator()
//    println(calc.add(1, 3))
//    println(calc.add(2, 6, 3))
//    println(calc.add(3.2, 4.6))

    val car = Car()
    println("Car brand: ${car.brand}")
    car.drive()
}