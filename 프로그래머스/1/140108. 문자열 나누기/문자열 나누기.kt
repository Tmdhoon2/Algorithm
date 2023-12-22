class Solution {
    fun solution(s: String): Int {
        var answer = 0

        var aCount = 1
        var bCount = 0
        var current = s.first()

        for (i in 1 until s.length) {
            if (s[i] == current) {
                aCount += 1
            } else {
                bCount += 1
            }

            if (aCount == bCount) {
                aCount = 0
                bCount = 0
                runCatching {
                    current = s[i + 1]
                }.onFailure {
                    current = s.last()
                }
                answer += 1
            }
        }
        
        if(aCount != 0 || bCount != 0){
            answer += 1
        }

        return answer
    }
}
