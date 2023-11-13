class Solution {
    fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()

    val list = mutableListOf<Char>()

    s.forEach {
        if (!list.contains(it)) {
            list.add(0, it)
            answer += -1
        } else {
            answer += list.indexOf(it) + 1
            list.add(0, it)
        }
    }

    return answer
}
}