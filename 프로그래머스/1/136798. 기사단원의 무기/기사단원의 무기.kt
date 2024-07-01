class Solution {
    
    private var numbers = mutableListOf<Int>()
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 1
        setNumbers(number)
        
        for(i in 2..number) {
            val count = getCount(i)
            if (count > limit) answer += power
            else answer += count
        }
        
        return answer
    }
    
    private fun getCount(n: Int): Int {
        var tempN = n
        var count = 1
        val temp = mutableListOf<Int>()
        for(i in 0 until numbers.size) {
            if (numbers[i] > n) break
            temp.add(numbers[i])
        }
        
        temp.reverse()
        
        for(i in 0 until temp.size) {
            var tempCount = 0
            while(tempN % temp[i] == 0) {
                tempCount++
                tempN /= temp[i]
            }
            
            count *= tempCount + 1
        }
        
        return count
    }
    
    private fun setNumbers(max: Int) {
        val array = Array(max + 1) { 0 }
        array[0] = 1
        array[1] = 1
        for(i in 2..Math.sqrt(max.toDouble()).toInt()) {
            if (array[i] == 0) {
                for(j in (i*2)..max step i) {
                    array[j] = 1
                }
            }
        }
        
        numbers.addAll(array.mapIndexed { index, i -> if (i == 0) index else 0}.filter { it != 0 })
    }
}

// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 2 2 2 2 2 2 2

// 10 | 1, 2, 5, 10 | 4
// 12 | 1, 2, 3, 4, 6, 12 | 6
// 18 | 1, 2, 3, 6, 9, 18 | 6
// 24 | 1, 2, 3, 4, 6, 8, 12, 24 | 8

// 2^1 * 5^1 | 4
// 2^2 * 3^1 | 6
// 2^1 * 3^2 | 6
// 2^3 * 3^1 | 8