class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = StringBuilder()
        val skips = mutableListOf<Int>().apply {
            skip.forEach {
                add(it.toInt())
            }
        }
            
        s.forEach { char ->
            var code = char.toInt()
            var current = 0
            while(current != index) {
                code += 1
                code = maxOf(code % 123, 97)
                if (!skips.contains(code)) {
                    current++
                }
            }
            answer.append(code.toChar())
        }
    
        return answer.toString()
    }
}