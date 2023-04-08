import java.util.*
fun main(){
    val list = arrayListOf<Int>()
    var temp = 0
    for(i in 1..10000){
        list.add(i)
    }
    for(i in 1..10000){
        temp += i
        for(j in 0.until(i.toString().length)){
            temp += Integer.parseInt(i.toString()[j].toString())
        }
        if(list.contains(temp)) list.removeAt(list.indexOf(temp))
        temp = 0
    }
    for(i in list.indices){
        println(list[i])
    }
}