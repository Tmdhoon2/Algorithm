class Solution {
    fun solution(num: Int): Int {
        if(num.toLong() == 1L) return 0
        var count = 0
        var temp = num.toLong()
        while(count != 500){
            count++
            if(temp % 2 == 0L){
                temp /= 2
            }else{
                temp = temp * 3 + 1
            }
            if(temp == 1L) break
        }

        return if(temp != 1L) -1
        else count
    }
}