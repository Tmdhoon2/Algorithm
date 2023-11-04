class Solution {
    fun solution(s: String): Boolean {
    if(s.length != 4 && s.length != 6){
        return false
    }
    for(i in s.indices){
        if(s[i].toInt() !in 48..57){
            return false
        }
    }
    return true
}
}