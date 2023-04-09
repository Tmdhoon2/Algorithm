import java.util.*
fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    var answer = 0
    if(a < 100) answer = a
    else{
        answer = 99
        for(i in a downTo 100){
            when(i.toString().length){
                4 -> {
                    if(i / 1000 - i / 100 % 10 == i / 100 % 10 - i / 10 % 10 && i / 100 % 10 - i / 10 % 10 == i / 10 % 10 - i / 1 % 10){
                        answer++
                    }
                }
                3 -> {
                    if(i / 100 % 10 - i / 10 % 10 == i / 10 % 10 - i / 1 % 10){
                        answer++
                    }
                }
            }
        }
    }
    println(answer)
}