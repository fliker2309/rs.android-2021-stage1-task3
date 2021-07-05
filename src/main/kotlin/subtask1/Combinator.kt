package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        if ( array[0] < 0 || array[1] <= 0 || array.size < 2 || array.isEmpty())
            return null

        val a = array[0]
        val b = array[1]

        for (i in 0..b) {
            if (factorial(b) == a * factorial(b - i) * factorial(i))
                return i
        }
        return null
    }

    private fun factorial(n: Int): Int {
        var factorial = 1
        for (i in 1..n) {
            factorial *= i
        }
        return factorial
    }
}
