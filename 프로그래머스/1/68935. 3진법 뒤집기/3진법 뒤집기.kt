class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var start = 3
        val list = mutableListOf<Int>()
        var temp = n

        val sb = StringBuilder()

        while(start <= n){
            list.add(start)
            start *= 3
        }

        list.reversed().forEach {
            val value = temp / it
            sb.append(value)
            temp -= value * it
        }

        sb.append(temp / 1)
        start = 1
        sb.forEach {
            answer += it.toString().toInt() * start
            start *= 3
        }

        return answer
    }
}