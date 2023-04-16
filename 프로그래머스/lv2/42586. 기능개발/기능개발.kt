class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val dayList = arrayListOf<Int>()
        for (i in progresses.indices) {
            val temp = (100 - progresses[i])
            if (temp % speeds[i] == 0) {
                dayList.add(temp / speeds[i])
            } else {
                dayList.add(temp / speeds[i] + 1)
            }
        }
        var max = dayList[0]
        var count = 1
        for (i in 1 until dayList.size) {
            if (max >= dayList[i]) {
                count++
            } else {
                max = dayList[i]
                answer += count
                count = 1
            }
        }
        answer += count
        return answer
    }
}