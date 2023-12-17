class Solution {
    fun solution(board: Array<IntArray>): Int {
    var answer = 0
    var size = 0
    val indexes = mutableListOf<Pair<Int, Int>>()

    for (i in board.indices) {
        for (j in board[i].indices) {
            size += 1
            val element = board[i][j]
            if (element == 1) {
                indexes.add(i to j)
            }
        }
    }

    val booms = mutableSetOf<Pair<Int, Int>>()

    indexes.forEach {
        val f = it.first
        val s = it.second
        booms.run {
            add(f - 1 to s - 1)
            add(f - 1 to s)
            add(f - 1 to s + 1)
            add(f to s - 1)
            add(f to s)
            add(f to s + 1)
            add(f + 1 to s - 1)
            add(f + 1 to s)
            add(f + 1 to s + 1)
        }
    }

    answer = booms.filter {
        val f = it.first
        val s = it.second
        f in 0..board.lastIndex && s in 0..board[0].lastIndex
    }.size

    return size - answer
}
}