package topic_05_strings

fun main() {
    // A string is a sequence of zero or more characters enclosed by double quotes e.g. "John", "".
    val name: String = "Abhishek"
    println(name)
    val empty = ""

    // Length of a string
    println(name.length)
    println(empty.length)

    // Concatenating strings
    val name1 = "1"
    val name2 = "2"
    val nameConc = name1+" "+name2
    println(nameConc)

    // Appending values to string -> An expression must start with a String.
    val str = "abhishek"+10+true
    println(str)
    println(str.length)

    /* Why did that work? First, it appends 10 to the string "abhishek",
       and then it appends true to the string "abhishek10true". */

    val str2 =  '1'+"0"+2 // char and string also work
    println(str2)
    println(str2.length)

//    val errorStr = 10+"Abhishek"  // error

//    repeat String
    println("Abhishek\n".repeat(5))

    val spell = "abra"
    println((spell + "cad").repeat(spell.length) + spell)

}