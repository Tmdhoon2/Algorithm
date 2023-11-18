class Solution {
    fun solution(n: Int): Int {
    var answer: Int = 0

    val array = Array(101) { 0 }

    var sum = 1

    for (i in 1..n) {
        while(sum % 3 == 0 || sum.toString().contains("3")){
            sum += 1
        }
        array[n] = sum
        sum += 1
    }

    return array[n]
}
}