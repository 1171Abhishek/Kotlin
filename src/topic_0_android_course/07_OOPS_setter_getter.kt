package topic_0_android_course

class SetterGetterClassLearn{
    var name: String = ""
        get() = field.uppercase()

        set(value) {
            field = value.trim()
        }
}

fun main() {
    val obj2 = SetterGetterClassLearn()
    obj2.name = "             Abhishek"
    println(obj2.name)
}

