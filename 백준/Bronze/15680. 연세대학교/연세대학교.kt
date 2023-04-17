import java.io.BufferedReader
import java.io.InputStreamReader
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    when(Integer.parseInt(readLine())){
        0 -> println("YONSEI")
        1 -> println("Leading the Way to the Future")
    }
}