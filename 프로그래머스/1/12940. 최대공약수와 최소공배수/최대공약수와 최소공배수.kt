class Solution {
    fun solution(n: Int, m: Int): IntArray {
    var answer = intArrayOf()
    var N = n
    var M = m
    var temp = 2

    val list = mutableListOf<Int>()

    while (true) {
        if (temp > N || temp > M) {
            break
        } else if (N % temp == 0 && M % temp == 0) {
            N /= temp
            M /= temp
            list += temp
        } else {
            temp += 1
        }
    }

    var result = 1
    list.forEach {
        result *= it
    }

    answer += result
    answer += result * M * N

    return answer
}
}