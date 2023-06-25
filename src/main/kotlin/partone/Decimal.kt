package partone

class Decimal {
    fun control() {
        inputCount()
        val numbers = inputNumber()

        var decimalCount = 0
        numbers.forEach { number ->
            if (judgeDecimal(number.toInt())) decimalCount++
        }
        printResult(decimalCount)
    }

    private fun judgeDecimal(number: Int): Boolean {
        var divisibleNumber = 0
        (1..number).forEach {
            if (number % it == 0) divisibleNumber++
        }

        return divisibleNumber == 2
    }

    private fun inputCount() {
        readln().toInt()
    }

    private fun inputNumber(): List<String> {
        val numbers = readln().split(" ")
        numbers.forEach { it.toInt() }
        return numbers
    }

    private fun printResult(decimalCount: Int) {
        println(decimalCount)
    }
}
