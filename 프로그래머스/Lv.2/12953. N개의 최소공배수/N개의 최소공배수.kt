class Solution {
    private val temp = mutableListOf<Int>()

    init {
        repeat(100) {
            temp.add(it + 1)
        }
        for (i in 2..100) {
            for (j in i * 2..100 step i) {
                temp.remove(j)
            }
        }
        temp.remove(1)
    }


    fun solution(arr: IntArray): Int {
        var answer = 1
        val list = arr.toMutableList()
        while (list.isNotEmpty()) {
            answer = getNumber(answer, list.removeFirstOrNull() ?: 1)
        }

        return answer
    }

    fun getNumber(a: Int, b: Int): Int {
        val list = mutableListOf<Int>()
        var first = a
        var second = b

        var index = 2
        while (true) {
            if (index > Math.max(first, second)) {
                break
            }
            if (first % index == 0 && second % index == 0) {
                first /= index
                second /= index
                list.add(index)
            } else {
                index++
            }
        }

        var answer = 1

        list.forEach {
            answer *= it
        }
        answer *= first
        answer *= second

        return answer
    }
}