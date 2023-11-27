class Solution {
    fun solution(n: Int): Long {
    val array = Array(2001) { 0 }
    array[1] = 1
    array[2] = 2

    for (i in 3..n) {
        array[i] = (array[i - 1] + array[i - 2]) % 1234567
    }

    return array[n].toLong()
}
}