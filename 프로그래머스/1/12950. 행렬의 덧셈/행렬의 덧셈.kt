class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()
    arr1.forEachIndexed { _index, ints ->
        var intArray = intArrayOf()
        ints.forEachIndexed { index, i ->
            intArray += i + arr2[_index][index]
        }
        answer += intArray
    }
    return answer
}
}