import java.io.BufferedReader
import java.io.InputStreamReader
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val S = readLine()
    val arrayList = arrayListOf<Char>()
    val answerList = arrayListOf<Int>()
    repeat(26){
        answerList.add(0)
    }
    for(i in 'a'..'z'){
        arrayList.add(i)
    }
    S.forEach {
        answerList[arrayList.indexOf(it)]++
    }
    answerList.forEach {
        print("$it ")
    }
}