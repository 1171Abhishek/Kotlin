package topic_android_course

//define class
class FirstClass{

//    define class method
    fun functionOne(){
        println("This is function 1")
    }

//    define class method
    fun functionTwo(){
        println("This is function 2")
    }

//    define few class properties
    val className = "OOPS First Class"
}

fun main() {
//    create object here
    val obj1 = FirstClass()
    obj1.functionOne()
    obj1.functionTwo()
    println(obj1.className)
}

