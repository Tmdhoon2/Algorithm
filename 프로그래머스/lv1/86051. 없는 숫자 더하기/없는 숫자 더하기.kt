class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        val arrayList = arrayListOf<Int>()
        repeat(10){
            arrayList.add(it)
        }
        numbers.forEach {
            if(arrayList.contains(it)){
                arrayList.removeAt(arrayList.indexOf(it))
            }
        }
        answer = arrayList.sum()
        return answer
    }
}