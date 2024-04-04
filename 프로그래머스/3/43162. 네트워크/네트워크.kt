class Solution {
private lateinit var array: Array<MutableList<Int>>
private lateinit var vis: Array<Int>

private fun dfs(n: Int) {
    vis[n] = 1
    array[n].forEach {
        if (vis[it] == 0) {
            dfs(it)
        }
    }
}

fun solution(n: Int, computers: Array<IntArray>): Int {
    var answer = 0

    array = Array(n) { mutableListOf() }
    vis = Array(n) { 0 }

    computers.forEachIndexed { xIndex, ints ->
        ints.forEachIndexed { yIndex, i ->
            if (xIndex != yIndex && i == 1) {
                array[xIndex].add(yIndex)
            }
        }
    }

    for (i in 0..array.lastIndex) {
        if (vis[i] == 0) {
            answer++
            dfs(i)
        }
    }

    return answer
}
}