import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val total = StringTokenizer(readLine())
    var a = total.nextToken().reversed()
    var b = total.nextToken().reversed()

    val stringBuilder = StringBuilder()

    var result = (Integer.parseInt(a) + Integer.parseInt(b)).toString().reversed()

    val answerList = arrayListOf<Int>()
    result.forEach {
        answerList.add(Integer.parseInt(it.toString()))
    }

    while(true){
        if(Integer.parseInt(answerList.first().toString()) == 0){
            answerList.removeAt(answerList[0])
        }else{
            break
        }
    }

    answerList.forEach {
        stringBuilder.append(it)
    }

    println(stringBuilder.toString())
}