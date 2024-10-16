package topic_0_android_course

/** A class consists of three major parts:
 * Properties. Variables that specify the attributes of the class's objects.
 * Methods. Functions that contain the class's behaviors and actions.
 * Constructors. A special member function that creates instances of the class throughout the program in which it's defined.
 * For naming use PasCal Case
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

