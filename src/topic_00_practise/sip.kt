package topic_00_practise

import kotlin.math.pow
import java.text.NumberFormat

fun calculateSIP(monthlyInvestment: Double, annualInterestRate: Double, years: Int): Double {
    val monthlyInterestRate = annualInterestRate / 12 / 100
    val numberOfMonths = years * 12

    val futureValue = monthlyInvestment * ((1 + monthlyInterestRate).pow(numberOfMonths.toDouble()) - 1) / monthlyInterestRate * (1 + monthlyInterestRate)

    return futureValue
}

fun main() {
    println("Monthly Invest Amount: ")
    val monthlyInvestAmount: Double = readln().toDouble()
    println("Annual Return: ")
    val annualReturn: Double = readln().toDouble()
    println("Time Frame: ")
    val timeFrame: Int = readln().toInt()

    val fV = calculateSIP(monthlyInvestAmount , annualReturn , timeFrame)
    val o = NumberFormat.getCurrencyInstance()
    val ok = o.format(fV)

    println(String.format("%.2f",fV))
    println(ok)



}