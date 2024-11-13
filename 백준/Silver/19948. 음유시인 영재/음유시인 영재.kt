import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val content = readLine()
    val title = StringBuilder().apply {
        content.split(" ").forEach {
            if (it.isNotBlank()) {
                append(it.first().uppercase())
            }
        }
    }
    var space = readLine().toInt()
    val keyboard = mutableMapOf<String, Int>().apply {
        readLine().split(" ").run {
            "abcdefghijklmnopqrstuvwxyz".forEachIndexed { index, c ->
                put(c.toString(), this[index].toInt())
            }
        }
    }

   /* println(title)
    println(content)
    println(space)
    println(keyboard.toList())*/

    title.forEachIndexed { index, it ->
        val key = it.toString().lowercase()
        if (index == 0) {
            keyboard[key] = keyboard[key]!! - 1
        } else {
            if (it != title[index - 1]) {
                keyboard[key] = keyboard[key]!! - 1
            }
        }

        if (keyboard[key]!! < 0) {
            println("-1")
            return
        }
    }

    content.forEachIndexed { index, it ->
        val key = it.toString().lowercase()
        if (it.toString().isBlank()) {
            if (content[index] != content[index - 1]) {
                space--
            }

            if (space < 0) {
                println("-1")
                return
            }
        } else {
            if (index == 0) {
                keyboard[key] = keyboard[key]!! - 1
            } else {
                if (it != content[index - 1]) {
                    keyboard[key] = keyboard[key]!! - 1
                }
            }

            if (keyboard[key]!! < 0) {
                println("-1")
                return
            }
        }
    }

    println(title)
}