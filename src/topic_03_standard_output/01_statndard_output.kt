package topic_03_standard_output

fun main() {
    // standard output displays the data on the screen

    // println() print with new line
    println("Hello")
    println("I")
    println("am")
    println("Kotlin")

    println("Kotlin is a modern programming language.")
    println() // prints an empty line
    println("It is used all over the world!")

    // print()  without new line 
    print("hello")
    print(" World")

    // String templates 

    val name = "Abhishek"
    println("Hello I am $name")

    val num1 = 12
    val num2 = 34
    println("The sum of $num1 and $num2 is ${num1 + num2}")



}
