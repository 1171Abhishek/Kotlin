package topic_0_android_course

/*
Method: A function inside a class that performs actions.
 */

class LearnMethod {
    //    Method
    fun firstName() {
        println("Abhishek")
    }

    //    Method 2
    fun lastName() {
        println("kumar")
    }

}

fun main() {
    val obj1 = LearnMethod() // Instance Created
    obj1.firstName()    // access method 1
    obj1.lastName()     // access method 2
}