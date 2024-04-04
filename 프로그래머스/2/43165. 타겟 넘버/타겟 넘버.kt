class Solution {
    private lateinit var array: Array<Int>
private lateinit var vis: Array<Int>

private var count = 0
private var Target = 0

private fun dfs(n: Int) {
    if (n == vis.size) {
        var sum = 0
        array.forEachIndexed { index, i -> if(vis[index] == 1) sum += i else sum -= i }
        if (sum == Target) count++
    } else {
        vis[n] = 1
        dfs(n + 1)
        vis[n] = 0
        dfs(n + 1)
    }
}

fun solution(numbers: IntArray, target: Int): Int {
    Target = target

    array = numbers.toTypedArray()
    vis = Array(array.size) { 0 }

    dfs(0)

    return count
}
}