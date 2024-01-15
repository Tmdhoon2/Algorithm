class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val list = mutableListOf(0, 0, 0)
        val a = listOf(1, 2, 3, 4, 5)
        val b = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val c = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        answers.forEachIndexed { index, i ->
            val elementA = a[if (a.lastIndex < index) index % a.size else index]
            val elementB = b[if (b.lastIndex < index) index % b.size else index]
            val elementC = c[if (c.lastIndex < index) index % c.size else index]

            list[0] += if (elementA == i) 1 else 0
            list[1] += if (elementB == i) 1 else 0
            list[2] += if (elementC == i) 1 else 0
        }
        
        val max = list.maxOrNull()!!
        
        list.forEachIndexed { index, i -> 
            if(i == max){
                answer += index + 1
            }
        }

        return answer
    }
}