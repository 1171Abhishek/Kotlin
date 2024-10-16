package topic_00_practise

fun main() {
    val name = null
    println(name)
    var name2: String? = "Abhishek"
    println(name2)
    println(name2?.length)
    name2 = null
    println(name2)
    println(name2?.length?:10)


}