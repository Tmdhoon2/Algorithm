class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val winNums = win_nums.toList()
        
        var max = 0
        var min = 0
        
        for(i in 0..5) {
            if (lottos[i] == 0) {
                min++
            } else if (winNums.contains(lottos[i])) {
                min++
                max++
            }
        }
        
        max = minOf(7 - max, 6)
        min = minOf(7 - min, 6)
        
        return intArrayOf(min, max)
    }
}