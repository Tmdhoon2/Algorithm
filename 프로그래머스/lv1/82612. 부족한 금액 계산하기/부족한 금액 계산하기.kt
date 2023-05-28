class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer = 0L
        repeat(count){
            answer += price*(it+1)
        }
        return if(money>=answer) 0 
        else answer - money
    }
}