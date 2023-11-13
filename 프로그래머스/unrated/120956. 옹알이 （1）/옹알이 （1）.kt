class Solution {
    fun solution(babbling: Array<String>): Int {
    var answer = 0

    val available = listOf("aya", "ye", "woo", "ma")

    babbling.forEach {
        var bab = it
        available.forEach { ava ->
            if (bab.contains(ava)) {
                bab = bab.replace(ava, " ")
            }
        }
        if(bab.isBlank()) answer += 1
    }

    return answer
}
}