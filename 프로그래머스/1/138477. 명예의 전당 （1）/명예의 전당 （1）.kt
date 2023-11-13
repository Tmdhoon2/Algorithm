class Solution {
    fun solution(k: Int, score: IntArray): List<Int> {
    val results = mutableListOf<Int>()
    val answer = mutableListOf<Int>()

    with(answer) {
        score.forEach {
            add(it)
            sort()
            reverse()
            if (size < k + 1) {
                results.add(last())
            } else {
                results.add(get(k - 1))
            }
        }
    }

    return results
}
}