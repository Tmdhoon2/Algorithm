class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        val list = getList(n)

        var i = 0
        var j = 0
        var count = 1

        val sum = getSum(n)

        var direction = Direction.D

        while (count != sum) {
            list[i][j] = count
            when (direction) {
                Direction.D -> {
                    if (i < n - 1 && list[i + 1][j] == 0) {
                        i++
                        count++
                    } else direction = Direction.R
                }

                Direction.R -> {
                    if (j < i && list[i][j + 1] == 0) {
                        j++
                        count++
                    } else direction = Direction.U
                }

                Direction.U -> {
                    if (i > 1 && j > 1 && list[i - 1][j - 1] == 0) {
                        i--
                        j--
                        count++
                    } else direction = Direction.D
                }
            }
        }

        list[i][j] = sum

        

        list.forEach {
            it.forEach { 
                answer.add(it)
            }
        }

        return answer.toIntArray()
    }

    fun getList(n: Int): MutableList<Array<Int>> {
        val list = mutableListOf<Array<Int>>()

        repeat(n) {
            list.add(Array(it + 1) { 0 })
        }

        return list
    }

    fun getSum(n: Int): Int {
        var sum = 0
        repeat(n) {
            sum += it + 1
        }

        return sum
    }
}

enum class Direction {
    D, R, U
}