class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val mutableSet = mutableSetOf<Int>()
        
        for(length in 1..elements.size) {
            if (length < elements.size) {
                getSum(length, elements).forEach {
                    mutableSet.add(it)
                }
            } else {
                mutableSet.add(elements.sum())
            }
        }
                        
        return mutableSet.size
    }
    
    fun getSum(
        length: Int,
        elements: IntArray,
    ): IntArray {
        var intArray = intArrayOf()
        
        repeat(elements.size) {
            var sum = 0
            for(i in it until it + length) {
                sum += elements[i % elements.size]
            }
            intArray += sum
        }
            
        return intArray
    }
}