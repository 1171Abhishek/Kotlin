package topic_0_android_course

//In Kotlin, getters and setters are methods used to access (get) and modify (set) the properties of a class.

class SetterGetterClass {
    var age = 10

        //    getter
        get() = field

        //    Setter
        set(value) {
            field = if (value < 18){
                18
            } else{
                20
            }
        }
}

fun main() {
     val obj1 = SetterGetterClass()
    println(obj1.age)
}
