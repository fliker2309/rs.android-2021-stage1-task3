package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return getSquares(
            number, number.square()
        )


    }

    private fun Int.square(): Long = (this.toLong() * this.toLong())


    private fun getSquares(number: Int, total: Long): Array<Int>? {
        for (i in number - 1 downTo 1) {
            if (i.square() == total) return Array(1) { i }

            val diff = total - i.square()
            if (diff > 0) {
                val array = getSquares(i, diff)
                if (array != null) return array.plus(i)
            }
        }
        return null
    }
}
