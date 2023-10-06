import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val count = readLine()
    val numbers = readLine().split(" ").toMutableList()
    val primeNumbers = getPrimeNumbers(1_000_000)

    //println(primeNumbers.toList().toString())

    var sum = 1L

    numbers.forEachIndexed { index, s ->
        val element = s.toInt()
        if(primeNumbers[element] == 0 && sum != element.toLong()){
            sum *= element
        }
    }

    bw.write(if(sum == 1L) "-1" else sum.toString())
    bw.flush()
    bw.close()
}

fun getPrimeNumbers(n: Int): List<Int> {
    val array = Array(n+1) { 0 }

    array[0] = 1
    array[1] = 1

    val end = Math.sqrt(n.toDouble()).toInt()

    for (i in 2..end) {
        if(array[i] == 0){
            for(j in i*2..n step i){
                array[j] = 1
            }
        }
    }

    /*val returnList = mutableListOf<Int>()

    array.forEachIndexed { index, i ->
        if(i == 0) {
            returnList.add(index)
        }
    }*/

    return array.toList()
}