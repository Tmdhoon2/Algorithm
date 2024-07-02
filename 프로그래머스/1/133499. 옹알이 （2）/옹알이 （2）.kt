class Solution {
    
    private val availables = mapOf(
        "aya" to true,
        "ye" to true,
        "woo" to true,
        "ma" to true,
    )
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        val babblings = babbling.toMutableList()
                
        for(i in 0 until babblings.size) {
            val sb = StringBuilder()
            var last = ""
            for(j in 0 until babblings[i].length) {
                sb.append(babblings[i][j])
                if (availables[sb.toString()] ?: false && last != sb.toString()) {
                    last = sb.toString()
                    sb.clear()
                }
            }
            
            if (sb.isEmpty()) {
                answer++
            }
        }        
        
        return answer
    }
}