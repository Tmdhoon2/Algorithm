class Solution {
    fun solution(phone_number: String) =
        StringBuilder().apply {
            phone_number.reversed().forEachIndexed { index, c ->
                if (index > 3) append("*")
                else append(c)
            }
        }.reversed().toString()
}