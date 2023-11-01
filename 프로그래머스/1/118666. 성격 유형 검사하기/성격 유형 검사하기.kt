class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scores = hashMapOf(
            1 to 3,
            2 to 2,
            3 to 1,
            4 to 0,
            5 to 1,
            6 to 2,
            7 to 3,
        )

        val personals = hashMapOf(
            'R' to 0,
            'T' to 0,
            'C' to 0,
            'F' to 0,
            'J' to 0,
            'M' to 0,
            'A' to 0,
            'N' to 0,
        )

        choices.forEachIndexed { index, i ->
            val personal = survey[index][when (i) {
                in 1..3 -> 0
                else -> 1
            }]
            val score = scores[i]!!

            personals.put(personal, score + personals[personal]!!)
        }

        val first = if (personals['R']!! >= personals['T']!!) 'R' else 'T'
        val second = if(personals['C']!! >= personals['F']!!) 'C' else 'F'
        val third = if(personals['J']!! >= personals['M']!!) 'J' else 'M'
        val fourth = if(personals['A']!! >= personals['N']!!) 'A' else 'N'

        return StringBuilder().apply {
            append(first)
            append(second)
            append(third)
            append(fourth)
        }.toString()
    }
}