package `01_Variable`

fun main(){
    // Declaring a variable 
    // var -- mutable 
    // val -- read only variable(Immutable) but not entirely
    // const -- is used for variables (with val) that are known at compile-time.

    // Both val and var keywords provide you a variable!

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



    
}

/*
What is a variable?
A variable is a storage for a value, which can be a string, a number, or something else. 
Every variable has a name (or an identifier) to distinguish it from other variables.
You can access a value by the name of the variable. 
*/