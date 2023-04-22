class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var min = arr[0]
        repeat(arr.size){
            if(min > arr[it]) min = arr[it]
        }
        repeat(arr.size){
            if(min != arr[it]) answer += arr[it]
        }
        if(answer.isEmpty()) answer += -1
        return answer
    }
}