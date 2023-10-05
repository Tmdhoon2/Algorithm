class Solution {
    fun solution(my_string: String, alp: String) =
        StringBuilder().apply { my_string.forEach { append(if (it.toString() == alp) it.uppercase() else it) } }
}