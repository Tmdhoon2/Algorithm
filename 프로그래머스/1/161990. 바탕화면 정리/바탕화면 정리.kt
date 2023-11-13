class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
    var minI = -1
    var minJ = -1
    var maxI = -1
    var maxJ = -1

    wallpaper.forEachIndexed { index, s ->
        if (s.contains('#')) {
            val firstIndex = s.indexOfFirst { it == '#' }
            val lastIndex = s.indexOfLast { it == '#' }
            if (minI == -1) {
                minI = index
            }

            if (minJ == -1 || minJ > firstIndex) {
                minJ = firstIndex
            }

            if (maxI < index) {
                maxI = index
            }

            if (maxJ < lastIndex) {
                maxJ = lastIndex
            }
        }
    }

    return intArrayOf(minI, minJ, maxI + 1, maxJ + 1)
}
}