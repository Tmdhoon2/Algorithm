import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    arrayListOf<Pair<Int,Int>>().run {
        val count = Integer.parseInt(readLine())
        repeat(count){
            if(count > it) {
                val stringTokenizer = StringTokenizer(readLine())
                val a = stringTokenizer.nextToken()
                val b = stringTokenizer.nextToken()
                add(Integer.parseInt(a) to Integer.parseInt(b))
            }
        }
        with(BufferedWriter(OutputStreamWriter(System.out))) {
                this@run.sortedWith(compareBy({ it.first }, { it.second })).run {
                    repeat(this@run.size){

                    write("${this[it].first} ${this[it].second}\n")
                }
            }
            flush()
            close()
        }
    }
}