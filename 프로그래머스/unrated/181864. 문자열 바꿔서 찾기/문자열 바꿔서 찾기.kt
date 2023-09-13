class Solution {
    fun solution(myString: String, pat: String): Int {
        val list = myString.toMutableList()

        repeat(list.size) {
            list[it] = if (list[it] == 'A') 'B' else 'A'
        }

        return if(StringBuilder().apply{ list.forEach { append(it) } }.toString().contains(pat)) 1 else 0
    }
}