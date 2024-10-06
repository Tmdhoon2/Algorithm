class Solution {
    fun solution(s: String): List<Int> {
        var answer = intArrayOf()
        val list = mutableListOf<List<Int>>()
        
        val result = mutableListOf<Int>()
        
        s.removePrefix("{").removeSuffix("}").replace("},{", " ").removePrefix("{").removeSuffix("}").split(" ").forEach {
            list.add(it.split(",").map { it.toInt() })
        }
        
        list.sortBy { it.size }
        
        for(i in 0 until list.size) {
            for(j in 0 until list[i].size) {
                result.add(list[i][j])
            }
        }
        
        return result.distinct()
    }
    
    fun getList(s: String): List<Int> {
        return s.replace("{", "").replace("}", "").split(",").map { it.trim().toInt() }
    }
}