class Solution {
    fun solution(s: String): Boolean {
    return Regex("[0-9]{4}|[0-9]{6}").matches(s)
}
}