class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val map = mutableMapOf<String, Int>()
        
        clothes.forEach { array ->
            val key = array[1]
            map[key] = (map[key] ?: 0) + 1
        }

        return map.values.map { it + 1 }.reduce { total, i ->
            total * i
        } - 1
    }
}