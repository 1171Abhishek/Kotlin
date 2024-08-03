package topic_05_strings

fun main() {
    // Raw String
//    A raw string can contain newlines and any other characters
    val rawString = """Hello I am 
        |Abhishek 
        |kumar and      i am 
        |                       a   
        |                           coder   
        |                                       
        |                                    /  ?  |  ''  :  ""  "        
        |                                           
    """.trimMargin()
    println(rawString)
}