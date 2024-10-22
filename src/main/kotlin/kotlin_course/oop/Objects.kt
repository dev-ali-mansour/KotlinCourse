package kotlin_course.oop

/*class Car {
    var brand: String = ""
    var speed: Int = 0

    fun accelerate() {
        speed += 10
        println("Now Car is going at $speed KM/H")
    }
}*/

/*class Car (var brand:String,var speed:Int){
    fun accelerate() {
        speed += 10
        println("Now Car is going at $speed KM/H")
    }
}*/

class Car2(var brand:String){
    var speed :Int =0

    constructor(brand: String,speed:Int):this(brand){
        this.speed=speed
    }

    fun accelerate() {
        speed += 10
        println("Now Car is going at $speed KM/H")
    }
}

fun main() {
//    val myCar = Car()
    val myCar = Car2(brand = "Toyota", speed = 5)
    myCar.brand = "Toyota"
    println("Car 1")
    myCar.accelerate()
    myCar.accelerate()
    println("Car 2")
    val myCar2 = Car2("Honda")
    myCar2.accelerate()
}