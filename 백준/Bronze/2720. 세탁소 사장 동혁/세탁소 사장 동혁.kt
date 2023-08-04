import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = br.readLine()

    var quarter = 0
    var dime = 0
    var nickel = 0
    var penny = 0

    val results = mutableListOf<MutableList<Int>>()

    repeat(count.toInt()){
        var input = br.readLine().toInt()
        quarter += input / 25
        input %= 25
        dime += input / 10
        input %= 10
        nickel += input / 5
        input %= 5
        penny += input / 1

        results.add(mutableListOf(quarter, dime, nickel, penny))

        quarter = 0
        dime = 0
        nickel = 0
        penny = 0
    }

    results.forEach {
        val sb = StringBuilder()
        it.forEach {
            sb.append(it)
            sb.append(" ")
        }

        bw.write(sb.toString().trim() + "\n")
        bw.flush()
    }

    bw.close()
}