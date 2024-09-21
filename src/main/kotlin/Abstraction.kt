package org.example

// Abstract Class
abstract class MyAnimal{
    abstract fun makeSound()

    fun breath(){
        println("The animal is breathing")
    }
}

// Concrete Class
class MyDog:MyAnimal(){
    override fun makeSound(){
        println("Bark!")
    }
}

// Interface
interface Drivable{
    fun drive()
}

class MyCar:Drivable{
    override fun drive(){
        println("The car is driving")
    }

    fun startEngine(){
        println("Start car engine")
    }
}

class Bicycle:Drivable{
    override fun drive() {
        println("The bicycle is riding")
    }

    fun chaneGear(){
        println("Change the gear")
    }
}

fun main() {
    val dog = MyDog()
    dog.makeSound()
    dog.breath()

    val car = MyCar()
    car.startEngine()
    car.drive()
    val bike = Bicycle()
    bike.drive()
}