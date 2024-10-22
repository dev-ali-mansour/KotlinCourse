package kotlin_course.loops

fun main() {
    /*var count = 1
    while (count <5){
        println(count++)
//        count++
    }*/

    val secretNumber = (1..5).random()
    var guess = readln().toInt()
    while (guess!=secretNumber){
        println("Try again!")
        guess = readln().toInt()
    }
}