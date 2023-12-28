class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val lowerList = ('a'..'z').toList()
        val upperList = ('A'..'Z').toList()

        s.forEach {
            if (it != ' ') {
                when (it.isUpperCase()) {
                    true -> {
                        answer += upperList[(upperList.indexOf(it) + n) % upperList.size]
                    }

                    else -> {
                        answer += lowerList[(lowerList.indexOf(it) + n) % lowerList.size]
                    }
                }
            } else {
                answer += ' '
            }
        }

        return answer
    }
}