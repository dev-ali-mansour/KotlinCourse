package org.example

open class Appliance(val brand:String){
    fun turnOn(){
        println("$brand appliance is now on")
    }

    fun turnOff(){
        println("$brand appliance is now off")
    }
}

class WashingMachine(brand: String,val capacity:Int):Appliance(brand){
    fun startWash(){
        println("$brand washing machine with $capacity kg is starting washing cycle")
        turnOff()
    }
}

class Microwave(brand: String,val power:Int):Appliance(brand){
    fun startHeating(){
        println("$brand Microwave with $power watt is heating food")
    }
}

class Keyboard(val type:String){
    fun pressKey(key:String){
        println("Key $key is pressed")
    }
}

class Computer(brand: String,val keyboard:Keyboard){
    fun typeText(text:String){
        println("Start typing on ${keyboard.type} keyboard")
        text.forEach { keyboard.pressKey(it.toString()) }
    }
}

fun main() {
    val washingMachine = WashingMachine(brand = "LG", capacity = 7)
    washingMachine.turnOn()
    washingMachine.startWash()

    val microwave = Microwave(brand = "Samsung", power = 1000)
    microwave.turnOn()
    microwave.startHeating()

    val keyboard=Keyboard(type = "Mechanic")
    val computer=Computer(brand = "Dell", keyboard=keyboard)
    computer.typeText("Hello")
}
