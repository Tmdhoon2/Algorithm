class Solution {
    fun solution(s: String): Int {
    var S = s
    val numbers = listOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
    )

    numbers.forEachIndexed { index, string ->
        S = S.replace(string, index.toString())
    }

    return S.toInt()
}
}