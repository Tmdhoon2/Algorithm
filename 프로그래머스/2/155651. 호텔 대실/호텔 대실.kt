class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        val inputs = book_time.map {
            val first = changeMinute(it[0])
            val second = changeMinute(it[1]) + 10
            first to second
        }.sortedBy { it.first }
        
        val answerList = mutableListOf<MutableList<Pair<Int, Int>>>()
        
        inputs.forEach { input ->
            if (answerList.isEmpty()) {
                answerList.add(mutableListOf(input))
            } else {
                var stop = -1
                for(i in 0 until answerList.size) {
                    for(j in 0 until answerList[i].size) {
                        val answer = answerList[i][j]
                        if (input.first >= answer.second) {
                            stop = i
                        } else {
                            stop = -1
                        }
                    }
                    
                    if (stop != -1) {
                        break
                    }
                }
                if (stop != -1) {
                    answerList[stop].add(input)
                } else {
                    answerList.add(mutableListOf(input))
                }
            }
        }
        println(answerList)
        return answerList.size
    }
    
    private fun changeMinute(time: String): Int {
        return time.split(":").run {
            get(0).toInt() * 60 + get(1).toInt()
        }
    }
}