package topic_00_practise
import java.util.Timer
import kotlin.concurrent.schedule
import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextFloat()*2-1
    println(randomNumber)
    val niftyValue = 24_000
    println(String.format("%.2f",randomNumber))
//    val currentNiftyValue =



        val timer = Timer()

        // Schedule a task to run every second
        timer.schedule(0, 1000) {
            // Generate and refresh random values here
            val randomValue = (Math.random() * 100).toFloat() // Random float between 0.0 and 100.0
            println("Random Value: ${"%.2f".format(randomValue)}")
            if (randomValue > 0.0){
                println(niftyValue+randomValue)
            } else{
                println(niftyValue - randomValue)
            }
            println(randomNumber)
        }

        // Keep the main thread alive to see the output (optional)
        Thread.sleep(10000) // Run for 10 seconds before stopping
        timer.cancel() // Stop the timer
    }


