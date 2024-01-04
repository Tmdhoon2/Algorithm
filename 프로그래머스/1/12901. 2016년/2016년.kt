import java.time.LocalDate

class Solution {
    fun solution(a: Int, b: Int) = LocalDate.parse("2016-${a.toString().padStart(2, '0')}-${b.toString().padStart(2, '0')}").dayOfWeek.toString().slice(0..2)
}