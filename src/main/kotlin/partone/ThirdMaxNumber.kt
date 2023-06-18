package partone

class ThirdMaxNumber {
    private fun arrayCount(): Int {
        return readln().toInt()
    }

    private fun arrayInfo(): MutableList<Int> {
        val array = readln().split(" ").map { it.toInt() }
        return array.toMutableList()
    }

    fun getThirdMaxNumber() {
        val count = arrayCount()
        val arrays = mutableListOf<MutableList<Int>>()
        val thirdMaxNumber = mutableListOf<Int>()

        repeat((1..count).count()) {
            arrays.add(arrayInfo())
        }

        arrays.forEach { array ->
            array.remove(array.max())
            array.remove(array.max())
            thirdMaxNumber.add(array.max())
        }

        thirdMaxNumber.forEach { number ->
            println(number)
        }
    }
}
