class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var list = mutableListOf<MutableList<Int>>()

        var basket = mutableListOf<Int>()

        for(i in 0 until board.size){
            var tempList = mutableListOf<Int>()
            for(j in 0 until board[i].size){
                tempList.add(board[j][i])
            }
            list.add(tempList)
        }

        moves.forEach {
            var index = 0
            if(list[it-1].lastOrNull() != 0) {
                while (list[it - 1][index] == 0) {
                    index += 1
                }
                basket.add(list[it-1][index])
                list[it-1][index] = 0
                if(basket.size >= 2 && basket[basket.lastIndex - 1] == basket[basket.lastIndex]){
                    basket.removeAt(basket.lastIndex - 1)
                    basket.removeLast()
                    answer += 2
                }
            }else{
                basket.add(0)
            }
        }

        println(answer)

        return answer
    }
}
