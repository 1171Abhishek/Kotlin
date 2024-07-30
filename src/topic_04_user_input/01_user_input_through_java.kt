package topic_04_user_input

import java.util.Scanner

fun main() {
//    If Scanner isn't needed, always use readln().
//    for simple task use readln and for complex task use java user input

    val scanner = Scanner(System.`in`)

    println("Enter number 1")
    val num1 = scanner.nextInt()

    println("Enter number 2")
    val num2 = scanner.nextInt()

    println("The sum of $num1 and $num2 is ${num1+num2}")

//    hasNextInt() // check user data input is same or not and return boolean

    val scanner2 = Scanner(System.`in`)
    print("Enter Int: ")
    val userInput = scanner2.hasNextInt()
    println(userInput)


    /*
    next - single string
    nextLine() - multiple string
     */
}
