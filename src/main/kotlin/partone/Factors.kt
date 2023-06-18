package partone

class Factors {
    fun getFactors() {
        val userInput = readln().split(" ").map { it.toInt() }
        val number = userInput[0]
        val index = userInput[1]

        val factors = (1..number).filter {
            number % it == 0
        }

        if (factors.size < index) {
            println(0)
        } else {
            println(factors[index - 1])
        }
    }
}
