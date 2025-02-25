package topic_02_data_types

/**
 * What is a data type?
 * All of us know that a number and a piece of text are pretty different.
 * How do we know this? Well, you can perform arithmetic operations (such as multiplication)
 * on numbers but not on texts. Kotlin also knows it. That's why every variable has a type that
 * determines what possible operations you can perform on this variable and which values you can store in it.
 */
fun main() {
//    Variable declaration
//    val/var identifier = initialization

//    Variable declaration with a type
//    val/var identifier: Type = initialization

//    Note: The type name always starts with an uppercase letter.

/*    Type inference is when a programming language automatically
      determines the type of variable or expression, so you don't have to specify it manually.
 */
    val text: String = "I am studying Kotlin now"
    val number: Int = 12

    /*
    val greeting
    greeting = "Hello" // error
     */

    val greet: String
    greet = "Good morning"
    println(greet)
    println(greet)

    val number12 = 1_000_000   // This is valid
    println(number12)


    val age: Int
//    age = "Abhishek"   // Type mismatch

}