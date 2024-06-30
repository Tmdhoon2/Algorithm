class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var rest = 0
        var N = n
        while(true) {
            if (N >= a) {
                if (N % a != 0) {
                    rest += N % a
                }
                N /= a
                N *= b
                answer += N
            } else {
                N += rest
                rest = 0
            }
            
            if (rest == 0 && N < a) break
        }
        return answer
    }
}