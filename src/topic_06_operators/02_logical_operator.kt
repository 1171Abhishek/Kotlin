package topic_06_operators

fun main() {
    // Logical NOT -> ! -> Reverse boolean value
    // Logical NOT is unary operator which operates on only one operand or value.
    println(!true)
    println(!false)

    // Logical AND -> && -> returns true if both operands are true. Otherwise, it returns false.
    // Logical AND is a binary operator that operates on two operands or values.
    println(true && true)
    println(true && false)
    println(false && false)

    // Logical OR -> || -> Returns true if at least one operand is true. Otherwise, it returns false.
    // Logical OR is a binary operator that operates on two operands or values.
    println(true || true)
    println(true || false)
    println(false || false)

    // XOR -> xor -> is logical operator is a binary operator that returns true if the
    // Boolean operands have different values. Otherwise, it is false.
    println(true xor true)
    println(true xor false)
    println(false xor false)
    println(1 xor 5)


}