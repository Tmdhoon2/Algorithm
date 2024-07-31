class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        var resultStartIndex = 0
        var resultEndIndex = 0
        
        var length = sequence.size
        
        var startIndex = 0
        var endIndex = 0
        
        var sum = sequence[0]
                
        while(true) {
            //sum = sequence.slice(startIndex..endIndex).sum()
            if (sum < k) {
                if (endIndex + 1 < sequence.size) {
                    endIndex ++
                    sum += sequence[endIndex]
                } else {
                    break
                }
            } else if(sum > k) {
                sum -= sequence[startIndex]
                startIndex ++
            } else {
                // val resultLength = resultEndIndex + 1 - resultStartIndex
                // val currentLength = endIndex + 1 - startIndex
                // if (resultLength > currentLength) {
                //     resultStartIndex = startIndex
                //     resultEndIndex = endIndex
                // }
                
                if (length > endIndex - startIndex) {
                    length = endIndex - startIndex
                    resultStartIndex = startIndex
                    resultEndIndex = endIndex
                }
                if (endIndex + 1 < sequence.size) {
                    endIndex ++
                    sum += sequence[endIndex]
                } else {
                    sum -= sequence[startIndex]
                    startIndex ++
                }
            }
            //     val resultLength = resultEndIndex + 1 - resultStartIndex
            //     val currentLength = endIndex + 1 - startIndex
            //     if (sum == k && resultLength > currentLength) {
            //         resultStartIndex = startIndex
            //         resultEndIndex = endIndex
            //         endIndex ++
            //     } else {
            //         startIndex ++
            //     }
            // }
        }
        
        return intArrayOf(resultStartIndex, resultEndIndex)
    }
}