package topic_android_course

fun main() {
    val favouriteNumber = null
    println(favouriteNumber)

//    Store null after a value
    var name: String? = "Abhishek"
    println(name)
    name = null
    println(name)

    /**Use nullable variables only when necessary, and prefer non-nullable variables for simpler handling.*/

//    access property of a nullable variable
//    use safe call operator -> ?.
    var myFriend: String? = "Abhishek 2"
    println(myFriend?.length)
    myFriend = null
    println(myFriend?.length)

    /** Note:
     * Using ?. on non-nullable variables is unnecessary, as access is always safe.
                The Kotlin compiler won't error, but it's redundant.
     * Safely handles null by returning null if the variable is null.
     */

//    elvish operator ?: 0
    var rank: String? = "12"
    println(rank)
    rank = null
    println(rank?.length?:1) // ?: 1: Elvis operator; provides 1 if the result is null.







}