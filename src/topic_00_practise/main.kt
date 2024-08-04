package topic_00_practise

fun main() {

    val design = """||---------------|
                       ||---------------|
        """.trimMargin()

    var countTwo:Int = 0
    do {


    var userInput = readln().toInt()
    var count = 0
//    countTwo += userInput

    for (i in 1..countTwo){
        println(design)
        println(countTwo)

    }
//        println("Hello")
        countTwo += 1
}while (userInput == 1)


  /*  do {

        println("Enter 1 to add or 0 to delete")
        var inputUser: Int = readln().toInt()
        var count = 1
        var counttwo = 1
        if (inputUser == 1) {
            val design = """||---------------|
                       ||---------------|
        """.trimMargin()
            while (counttwo <= count){
            println(design)
                counttwo++
            }
            count++
        } else {
            println("No")
        }

    }while(inputUser >= 1)*/

}