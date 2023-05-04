class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var temp = s
        var zeroCount = 0
        var count = 0
        while(true){
            val index = temp.indexOf('0')
            if(index != -1){
                temp = temp.removeRange(index, index+1)
                zeroCount++
            }else {
                temp = Integer.toBinaryString(temp.length)
                count++
            }

            if(temp == "1"){
                count++
                break
            }
        }

        answer += count
        answer += zeroCount

        return answer
    }
}