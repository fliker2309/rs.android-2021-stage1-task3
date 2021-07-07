package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        if (number[0] == '-') return null

        val numChars = number.toCharArray()
        for (i in 0..numChars.size) {
            /*  when (numChars[i]) {
                '1' -> //TODO
                    '2'
                ->//TODO

                    '3'
                ->  //TODO
                    //  '7'                ->
                    '8' tyty
                            '4'
                -> //TODO
                    '5'
                -> yg
                '6' -> gfgf
                ->
                    '9'
                ->
                    '0'
                ->
                else -> return null

            }

        }*/


            throw NotImplementedError("Not implemented")
        }

        /* private fun changeNumber(pos: Int, nums: Array<Char>, number: String): ArrayList<String> {

    }*/

        val totalMap = mapOf(
            '0' to arrayListOf('8'),
            '1' to arrayListOf('2', '4'),
            '2' to arrayListOf('1', '3', '5'),
            '3' to arrayListOf('2', '6'),
            '4' to arrayListOf('1', '5', '7'),
            '5' to arrayListOf('2', '4', '6', '8'),
            '6' to arrayListOf('3', '5', '9'),
            '7' to arrayListOf('4', '8'),
            '8' to arrayListOf('5', '7', '9', '0'),
            '9' to arrayListOf('6', '8')
        )
    }
}
