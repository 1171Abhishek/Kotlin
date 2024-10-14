package topic_0_android_course

// Main function, the entry point of the program
fun main() {
    greet() // Call the greet function
    println(returnFunction()) // Call the returnFunction and print its returned value
    parameterFunction("Abhishek", 19) // Call parameterFunction with positional arguments
    parameterFunction(age = 20, name = "Abhishek") // Call parameterFunction with named arguments
    defaultArgumentFunction() // Call defaultArgumentFunction using default parameter values
}

// Declare a function with no parameters and no return value
fun greet() {
    println("Hello") // Print a greeting message
}

// Declare a function that returns an Int value
fun returnFunction(): Int {
    return 100 // Return the value 100
}

// Declare a function with parameters for name and age
fun parameterFunction(name: String, age: Int) {
    println("Hello I'm $name and I am $age years old") // Print a message using the provided parameters
}

// Declare a function with default values for parameters
fun defaultArgumentFunction(name: String = "Abhishek", age: Int = 19) {
    // If no arguments are provided, it uses the default values
    println("Hello I'm $name and I am $age years old") // Print a message using the parameters
}
