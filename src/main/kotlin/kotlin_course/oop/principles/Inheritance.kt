package kotlin_course.oop.principles

open class Animal{
    var name: String = "Unknown"

    fun eat(){
        println("$name is eating")
    }

    open fun sound(){
        println("Animal is making a sound")
    }
}

class Dog: Animal(){
    fun bark(){
        println("Dog is barking")
    }

    override fun sound(){
        println("Dog is making a sound")
    }
}

fun main() {
val myDog = Dog()
    myDog.name = "Jack"
    myDog.sound()
    myDog.bark()
    myDog.eat()
}