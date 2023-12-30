class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        var map: MutableMap<String, Int> = mutableMapOf()

        name.forEachIndexed { index, s ->
            map[s] = yearning[index]
        }

        photo.forEach {
            var sum = 0
            it.forEach { 
                sum += map[it] ?: 0
            }
            answer += sum
        }

        return answer
    }
}