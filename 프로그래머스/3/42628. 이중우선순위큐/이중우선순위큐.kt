class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf()
        val list = mutableListOf<Int>()
        operations.forEach {
            val command = it.split(" ")[0]
            val number = it.split(" ")[1].toInt()

            when (command) {
                "I" -> {
                    list.add(number)
                }

                "D" -> {
                    if (list.isNotEmpty()) {
                        when (number) {
                            1 -> list.remove(list.maxOrNull()!!)
                            else -> list.remove(list.minOrNull()!!)
                        }
                    }
                }
            }
        }

        if (list.isEmpty()) {
            answer += 0
            answer += 0
        } else {
            answer += list.maxOrNull()!!
            answer += list.minOrNull()!!
        }

        return answer
    }
}