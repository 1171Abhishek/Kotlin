package topic_0_android_course

/** A class consists of three major parts:
 *
 * Properties.A variable inside a class that holds data and can have custom getters and setters.
 *
 * Methods. A function inside a class that performs a specific action.
 *
 * Constructors. Initializes an object when a class is instantiated.
                    Primary Constructor: Declared in the class header.
                    Secondary Constructor: Defined inside the class using constructor
 */

class ClassNumberOne{

//    Define class method
    fun methodOne(){
        println("This is method 1")
    }

//    Define class property
    val className = "Abhishek First OOPS Class"


}

fun main() {
//    Creating Object of class
    val objectOne = ClassNumberOne()
    objectOne.methodOne() // access class method
    println(objectOne.className) // access class property

}

