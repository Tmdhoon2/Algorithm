import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val players = mutableListOf<Player>()
    repeat(n) {
        val input = readLine()
            .replace("[", "")
            .replace("{", "")
            .replace("}", "")
            .replace("]", "")
            .split(",")

        var name = ""
        var score = 0L
        var isHidden = false

        input.forEachIndexed { index, string ->
            if (string.isNotBlank()) {

                when (index) {
                    0 -> {
                        name = string.split(":")[1].slice(1..string.split(":")[1].lastIndex - 1)
                    }

                    1 -> {
                        score = string.split(":")[1].toLong()
                    }

                    2 -> {
                        isHidden = string.split(":")[1].toInt() == 1
                    }
                }
            }
        }

        players.add(
            Player(
                rank = 0L,
                name = name,
                score = score,
                isHidden = isHidden,
            )
        )
    }
    players.sortWith(compareByDescending<Player>({ it.score }).thenBy(Player::name))
    var rank = 1L
    players[0].rank = rank
    for(i in 1..players.lastIndex) {
        val previous = players[i - 1]
        val current = players[i]
        if (current.score == previous.score) {
            current.rank = previous.rank
        } else {
            rank = (i + 1).toLong()
            current.rank = rank
        }
    }

    players.forEach {
        if (!it.isHidden) {
            println("${it.rank} ${it.name} ${it.score}")
        }
    }
}

private data class Player(
    var rank: Long,
    val name: String,
    val score: Long,
    val isHidden: Boolean,
)