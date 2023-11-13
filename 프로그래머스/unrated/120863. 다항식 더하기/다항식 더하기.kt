class Solution {
    fun solution(polynomial: String): String {
    var x = 0
    var normal = 0

    polynomial.replace("+", "").split(" ").filter { it.isNotBlank() }.forEach {
        if (it.contains('x')) {
            when (it.length) {
                1 -> x += 1
                else -> x += it.replace("x", "").toInt()
            }

        } else normal += it.toInt()
    }

    return "${if (x > 1) x else ""}${if(x>=1) "x" else ""} ${if(normal != 0 && x != 0) "+" else ""} ${if (normal != 0) normal else ""}".trim()
}
}