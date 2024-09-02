package topic_android_course

/** else if vs when
 * - else if : Simple checks
 * - when : Complex conditions
 */

fun main() {
//    If else
    if (10 == 10) {
        println(10)
    } else if ('a' == '2') {
        println("It is not equals to 10")
    } else {
        println("Just kidding")
    }


//    when statement
    val age = 20
    val resultIs = when(age){
        1 -> println("Hello")
        2,3,4,5 -> println("Bhai pana nhi chal rha hain")
        in (6..20) -> println("sayad ish range main hoga")
        is Int -> println("sayad")
        else -> println("No")
    }
}
