package study.secondweek

class Plus3 {
    fun main() {
        val numbers = readln().split(" ").map { it.toInt() }

        println(numbers.sum())
    }
}
