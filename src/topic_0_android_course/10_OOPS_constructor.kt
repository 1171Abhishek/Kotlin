package topic_0_android_course

/*
A constructor is a special function in a class that runs when an object is created. It is used to initialize properties.
- Primary Constructor
- Secondary Constructor
 */

//  primary Constructor
class Person(val name: String, val age: Int)

// init
class Person2(val name: String, val age: Int){
//    When you use an init block, the code inside it runs automatically as
//    soon as you create an object of the class.
    init {
        println("I am $name and I am $age years old")
    }
}

//  Secondary Constructor
class Student{

    var name: String
    var age: Int

    constructor(name: String , age: Int){
        this.name = name
        this.age = age
        println("Bhai mera naam $name hain aur main $age saal ka huuuu.")
    }
}


fun main() {
    val obj1 = Person("Abhishek" , 19)
    println(obj1.name)
    println(obj1.age)

    val obj2 = Person2("Abhi" , 19)
    val obj3 = Person2("Pro" , 18)

    val student = Student("Shek" , 19)
}