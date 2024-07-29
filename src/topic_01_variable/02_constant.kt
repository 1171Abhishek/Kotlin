package topic_01_variable

// Constant declaration
//const variables need to be declared on top level, outside any functions:
//The value of a const variable is known at compile time and won't be changed at runtime:
/*compile time : Compile time is the stage where the program's code is translated from a high-level
language into a form that can be executed by the computer, often machine code. */
//run time : Runtime is the stage when the compiled program is actually executing.

const val CONST_NAME = "Abhishek Constant"
const val CONST_INT = 127
const val CONST_DOUBLE = 3.14
const val CONST_CHAR = 'c'
const val CONST_STRING = "I am constant"
//    const val CONST_ARRAY = arrayOf(1, 2, 3) // error: only primitives and strings are allowed

fun main(){
//  val is not a synonym of immutable
    val friendName = mutableListOf("Abhishek", "Chunu")
    println(friendName)

//  friendName = mutableListOf("A","B","C,"D")  // ERROR : BECAUSE REASSIGNING IS NOT ALLOWED IN THIS
    friendName.add("Golu")  // change the internal state of val friendName
    println(friendName)

    // accessing constant
    println(CONST_NAME)


}