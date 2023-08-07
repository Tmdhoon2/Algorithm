import java.io.*

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    readLine()
    val cards = readLine().split(" ").toSet()
    readLine()
    val has = readLine().split(" ").toSet()

    val sb = StringBuilder()

    has.forEach {
        if(cards.contains(it)){
            sb.append("1 ")
        }else{
            sb.append("0 ")
        }
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}