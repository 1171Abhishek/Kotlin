package topic_0_android_course

fun main() {
    areaAndPerimeterCalculator(10.0, 20.0)
}

fun areaAndPerimeterCalculator(num1: Double, num2: Double) {
    println("Area of Rectangle: ${num1 * num2}")
    println("Perimeter of Rectangle: ${2 * (num1 + num2)}")
}