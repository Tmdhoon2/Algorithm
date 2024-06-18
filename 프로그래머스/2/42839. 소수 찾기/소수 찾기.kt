import kotlin.math.sqrt

class Solution {
    

fun solution(numbers: String): Int {
    val list = numbers.toMutableList()
    list.sortDescending()
    val max = list.toString().removePrefix("[").removeSuffix("]").replace(", ", "").toInt()

    val array = Array(max + 1) { 0 }

    array[0] = 1
    array[1] = 1

    for (i in 2..(sqrt(max.toDouble())).toInt()) {
        if (array[i] == 0) {
            for (j in (i * 2)..max step i) {
                array[j] = 1
            }
        }
    }

    val minorities = array.mapIndexed { index: Int, i: Int -> if (i == 0) index else 0 }.filter { it != 0 }.toMutableList().removeWrongNumber(list.map { Integer.parseInt(it.toString()) })

    return minorities.count()
}

private fun MutableList<Int>.removeWrongNumber(list: List<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()
    this.forEach { iElement ->
        val string = iElement.toString().map { it.toString() }.toMutableList()
        list.forEach {
            string.remove(it.toString())
        }
        if (string.isEmpty()) {
            result.add(iElement)
        }
    }

    return result
}     
}