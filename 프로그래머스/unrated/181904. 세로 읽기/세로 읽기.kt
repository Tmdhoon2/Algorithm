class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        return StringBuilder().apply {
            for(i in c-1 until my_string.length step m){
                append(my_string[i])
            }
        }.toString()
    }
}