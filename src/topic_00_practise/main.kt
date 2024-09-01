package topic_00_practise

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
fun main() {



        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("hh:mm:ss a")
        val formatted = current.format(formatter)


    val hour = current.format(DateTimeFormatter.ofPattern("hh"))
    val minute = current.format(DateTimeFormatter.ofPattern("mm"))
    val second = current.format(DateTimeFormatter.ofPattern("ss"))
    val amPm = current.format(DateTimeFormatter.ofPattern("a"))

    println("Hour: $hour")
    println("Minute: $minute")
    println("Second: $second")
    println("AM/PM: $amPm")

        println("Current time: $formatted")


}