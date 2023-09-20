class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for(i in left..right){
            when(getCount(i) % 2){
                0 -> answer += i
                else -> answer -= i
            }
        }
        return answer
    }

    fun getCount(input: Int): Int {
        var a = input
        val map = mutableMapOf<Int, Int>()
        var temp = 2
        while (a != 1) {
            while (true) {
                if (a % temp == 0) {
                    a /= temp
                    break
                }
                temp += 1
            }
            map.put(
                temp, if (map.containsKey(temp)) map.getValue(temp) + 1
                else 1
            )
            temp = 2
        }

        val newMap = map.map { it.value + 1 }

        var result = 1

        newMap.forEach {
            result *= it
        }

        return result
    }
}