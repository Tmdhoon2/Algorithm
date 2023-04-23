class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        val nl = arrayListOf<Int>()
        repeat(signs.size){
            nl.add(absolutes[it] * if(signs[it]) 1 else -1)
        }
        nl.forEach {
            answer += it
        }
        return answer
    }
}