package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        val listNumbers = numberMap()

        val result = mutableListOf<String>()
        val numChars = number.toCharArray()
        for (i in numChars.indices) {
            if (!numChars[i].isDigit())
                return null

            val neighbourNumber = numChars.clone()
            val neighbours: List<Int>? = listNumbers[Character.getNumericValue(neighbourNumber[i])]
            changeNumber(i, result, neighbours, neighbourNumber)
        }
        return result.toTypedArray()
    }

    private fun changeNumber(pos: Int, result: MutableList<String>, neighbours: List<Int>?, number: CharArray) {
        neighbours?.let {
            for (j in it.indices) {
                number[pos] = '0' + it[j]
                result.add(number.joinToString(separator = ""))
            }
        }
    }

    private fun numberMap(): Map<Int, List<Int>> {
        return mapOf(
            0 to listOf(8),
            1 to listOf(2, 4),
            2 to listOf(1, 3, 5),
            3 to listOf(2, 6),
            4 to listOf(1, 5, 7),
            5 to listOf(2, 4, 6, 8),
            6 to listOf(3, 5, 9),
            7 to listOf(4, 8),
            8 to listOf(5, 7, 9, 0),
            9 to listOf(6, 8)
        )
    }
}
