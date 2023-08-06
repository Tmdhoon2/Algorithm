import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<String>()

    while (true) {
        val tempList = readLine().split(" ")
        if (tempList.contains("0")) break
        list.add(checkTriangle(tempList))
    }

    list.forEach {
        bw.write(it)
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

fun checkTriangle(triangle: List<String>): String {
    val first = triangle[0].toInt()
    val second = triangle[1].toInt()
    val third = triangle[2].toInt()

    var result = ""

    if (first == second && second == third) {
        result = "Equilateral"
    } else if(!check(first, second, third)){
        result = "Invalid"
    }
    else if (first == second || second == third || third == first) {
        result = "Isosceles"
    } else {
        result = "Scalene"
    }

    return result
}

fun check(
    first: Int,
    second: Int,
    third: Int,
): Boolean{
    val list = mutableListOf(first, second, third)
    val max = list.maxOrNull()
    list.remove(max)

    return max!! < list.sum()
}