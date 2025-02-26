package topic_0_android_course

/*
Class Properties : A variable inside a class that holds data and can have custom getters and setters.
 */

class LearnClassProperties {
//    Properties are defined inside a class but outside functions.

    var name = "Unknown" // mutable property
    val age = 19 // immutable property (2005-2024) = 19 years and 6 months . as on feb 2025

}


fun main() {
    val obj1 = LearnClassProperties()
    println(obj1.name)
    obj1.name = "Abhishek"
    println(obj1.name)
}