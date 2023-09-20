class Solution {
    fun solution(s: String): String = s.toList().sortedDescending().toString().removeSurrounding("[", "]").replace(",", "").replace(" ", "")
}