class Solution {
    fun solution(n: Int): String = StringBuilder().apply {
        repeat(n){
            if((it+1) % 2 == 0) append("박")
            else append("수")
        }
    }.toString()
}