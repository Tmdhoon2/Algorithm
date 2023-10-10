class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val widths = mutableListOf<Int>()
        val heights = mutableListOf<Int>()

        sizes.forEach {
            with(it.toList().sortedDescending()){
                widths.add(first())
                heights.add(this[1])
            }
        }

        return widths.maxOrNull()!! * heights.maxOrNull()!!
    }
}