class Solution {
    var y = 0

    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        this.y = yellow
        val positions = mutableListOf<Pair<Int, Int>>()
        val list = getList(brown + yellow)
        list.reverse()

        repeat(Math.round(list.size.toDouble() / 2.0).toInt()) {
            positions.add(list[it] to list[list.lastIndex - it])
        }

        positions.forEach {
            if(getCorrect(it)){
                answer += it.first
                answer += it.second
            }
        }

        println(answer.toList())

        return answer
    }

    private fun getList(number: Int): MutableList<Int> {
        val list = mutableListOf<Int>()
        for (i in 1..number) {
            if (number % i == 0) {
                list.add(i)
            }
        }

        return list
    }

    private fun getCorrect(position: Pair<Int, Int>): Boolean {
        var first = position.first
        var second = position.second

        while (first > 0 && second > 0) {
            if (first * second == y) {
                return true
            } else {
                first -= 1
                second -= 1
            }
        }

        return false
    }
}