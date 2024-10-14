package topic_01_variable

fun main() {
    // Declaring a variable
    // var -- mutable
    // val -- read only variable(Immutable) but not entirely
    // const -- is used for variables (with val) that are known at compile-time.
    // camelCase for variable naming (val and var)
    // capital letter and underscore for constant

    // Both val and var keywords provide you a variable!
    // use val as default for better practise.

//    val/var identifier = initialization

    val language = "Kotlin"
    println(language)

    var dayOfWeek = "Monday"
    println(dayOfWeek)

    dayOfWeek = "Tuesday"
    println(dayOfWeek)


    // Storing different types of values
    val ten = 10
    val greeting = "Hello"
    var firstLetter = 'A'

    println(ten)
    println(greeting)
    println(firstLetter)


    // required same type as the initial
    var age = 18
    println(age)

    // age = "ten" // error
    println(age)


    // declare variable first and then initialize value
    val name: String
    name = "Abhishek"
    println(name)

    // change internal state of val
    val charList = mutableListOf('A', 'B', 'C', 'D')
    println(charList)
//    charList =   mutableListOf('A','B','C','D','E','F') // Resign is not allowed
    charList.add('E') // Changed the internal state here
    println(
        charList
    )
}

/*
What is a variable?
A variable is a storage for a value, which can be a string, a number, or something else.
Every variable has a name (or an identifier) to distinguish it from other variables.
You can access a value by the name of the variable.
*/