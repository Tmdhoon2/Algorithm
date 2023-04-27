class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        var start = 0
        val pairList = arrayListOf<MPair>()

        while(true) {

            repeat(want.size) {
                pairList.add(MPair(want[it], 0))
            }

            repeat(10) {
                if(want.contains(discount[it+start])){
                    val index = want.indexOf(discount[it+start])
                    pairList[index].second += 1
                }
            }

            var boolean = true

            repeat(number.size){
                if(number[it] > pairList[it].second) boolean = false
            }

            if(boolean) answer += 1

            start ++

            pairList.clear()

            if(start + 10 == discount.size+1) break
        }

        return answer
    }
}

class MPair(
    var first: String,
    var second: Int,
)