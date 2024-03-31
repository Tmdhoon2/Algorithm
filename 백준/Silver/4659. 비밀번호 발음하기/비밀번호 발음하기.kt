import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val list1 = listOf('a', 'e', 'i', 'o', 'u')
private val list2 = ('a'..'z')
private val map = mutableMapOf<Char, Boolean>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    list2.forEach {
        map[it] = list1.contains(it)
    }


    while (true) {
        val input = readLine()
        if (input == "end") {
            break
        } else {
            bw.write("<$input>")
            bw.write(" is ${if(checkValidation(input = input)) "" else "not " }acceptable.")
            bw.write("\n")
        }
    }

    bw.flush()
    bw.close()
}

private fun checkValidation(input: String): Boolean {
    if (!one(input = input)) {
        return false
    }

    if (!two(input = input)) {
        return false
    }

    if (!three(input = input)) {
        return false
    }

    return true
}

private fun one(input: String): Boolean {
    var result = false
    for (i in 0 until list1.size) {
        if (input.contains(list1[i])) {
            result = true
            break
        }
    }
    return result
}

private fun two(input: String): Boolean {
    var current = input[0]
    var count = 1
    var result = true

    for (i in 1 until input.length) {
        if (count >= 3) {
            result = false
            break
        }
        when (map[current]!!) {
            true -> {
                if (map[input[i]]!!) {
                    count++
                } else {
                    current = input[i]
                    count = 1
                }
            }

            false -> {
                if (!map[input[i]]!!) {
                    count++
                } else {
                    current = input[i]
                    count = 1
                }
            }
        }
    }

    if (count >= 3) {
        result = false
    }

    return result
}

private fun three(input: String): Boolean {
    var current = input[0]
    var result = true
    for (i in 1 until input.length) {
        if (current == input[i]) {
            if (!((current == 'e' && input[i] == 'e') || (current == 'o' && input[i] == 'o'))) {
                result = false
                break
            }
        } else {
            current = input[i]
        }
    }
    return result
}