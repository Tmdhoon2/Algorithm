import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val array = Array(8) { index ->
        Array(8) {
            if (it % 2 == if (index % 2 == 1) 0 else 1) 1
            else 0
        }
    }

    val numberBoard = mutableListOf<String>()

    repeat(8) { i ->
        repeat(8) { j ->
            numberBoard.add((j + 1 + i * 8).toString())
        }
    }
    numberBoard.reverse()

    val stringBoard = mutableListOf<String>()

    for(i in 1..8) {
        val sb = StringBuilder()
        for(j in 'A'..'H') {
            sb.append(j)
            sb.append(i)
            stringBoard.add(sb.toString())
            sb.clear()
        }
    }
    stringBoard.reverse()

    repeat(readLine().toInt()) {
        val (a, b) = readLine().split(" ")
        var answerA = 0
        var answerB = 0
        if (numberBoard.indexOf(a) == -1) {
            answerA = stringBoard.indexOf(a)
        } else {
            answerA = numberBoard.indexOf(a)
        }

        if (numberBoard.indexOf(b) == -1) {
            answerB = stringBoard.indexOf(b)
        } else {
            answerB = numberBoard.indexOf(b)
        }

        println(if (array[answerA / 8][7 - answerA % 8] == array[answerB / 8][7 - answerB % 8]) "YES" else "NO")
    }
}