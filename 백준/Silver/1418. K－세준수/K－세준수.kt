import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var answer = 1
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val k = readLine().toInt()

    for(i in 2..n){
        val primeMax = getPrimeMax(i)
        if(primeMax <= k) answer += 1
    }

    bw.write(answer.toString())
    bw.flush()
    bw.close()
}

fun getPrimeMax(n: Int): Int{
    val list = mutableSetOf<Int>()
    var temp = n
    var start = 2
    while(temp != 1){
        if(temp % start == 0) {
            temp /= start
            list += start
        }
        else start += 1
    }

    return list.maxOrNull()!!
}