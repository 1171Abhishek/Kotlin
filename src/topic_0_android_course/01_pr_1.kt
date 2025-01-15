package topic_0_android_course

// This is Rough part for my practise

class Practise1 {
    // class property
    val name: String = "Abhishek kumar"

    //    class method
    fun printName() {
        println("Hello this is function 1")
    }
}


fun main() {
//    object created
    val obj1 = Practise1()

    println(obj1.name) // property access
    obj1.printName() // access method of class
}


fun addTwoNumbersWithGemini(a: Int, b: Int): Int {
    return a + b
}
