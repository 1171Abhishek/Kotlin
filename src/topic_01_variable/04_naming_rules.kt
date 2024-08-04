package topic_01_variable

/** Naming Rules
 * Case sensitive
 * name only contain letters , underscore and digits
 * name cannot start with digit
 * name cannot be a keyword
 * wide space are not allowed, but we can use `` to contain wide space
 * use camelCase for variable naming
 * for constant use snake_case and all letters should be upper case only
 */

const val WEEK_DAYS = 7
fun main() {
    val `my name` = "Abhishek" // we should not use this
    println(`my name`)

    val myNameIs = "Abhishek"  // camelCase
    println(myNameIs)
    println(WEEK_DAYS)
}