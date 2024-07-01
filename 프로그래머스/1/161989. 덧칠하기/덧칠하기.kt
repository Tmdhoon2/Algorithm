class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var sections = section.toList()
        
        while(sections.size > 1) {
            val first = sections.firstOrNull() ?: break
            val range = first..(first + m - 1)
            
            sections = sections.filter { it !in range }
            //println(first)
            answer++
        }
        
        if (sections.isNotEmpty()) {
            answer ++
        }
        
        return answer
    }
}