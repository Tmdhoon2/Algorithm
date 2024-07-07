class Solution {
    
    private val map = mutableMapOf<Char, Int>()
    
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        repeat(targets.size) {
            answer += 0
        }
        
        for(i in 0 until keymap.size) {
            for(j in 0 until keymap[i].length) {
                map[keymap[i][j]] = minOf(map[keymap[i][j]] ?: j + 1, j + 1)
            }
        }
        
        for(i in 0 until targets.size) {
            var sum = 0
            for(j in 0 until targets[i].length) {
                val element = map[targets[i][j]]
                if (element == null) {
                    sum = -1
                    break
                } else {
                    sum += element
                }
            }
            answer[i] = sum
        }
        
        return answer
    }
}