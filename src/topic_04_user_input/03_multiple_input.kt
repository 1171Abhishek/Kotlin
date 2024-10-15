package topic_04_user_input

fun main() {
    /*val name = readln()
    val age = readln().toInt()
    println("My name is $name and I am $age years old")*/

    val (a , b) = readln().split(" ")
    println("$a and ${10*b.toInt()}")
}