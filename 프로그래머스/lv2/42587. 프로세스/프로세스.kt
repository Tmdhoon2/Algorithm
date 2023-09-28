class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var count = 0
        var location = location
        // 중복 값 카운트 세기
        val element = priorities[location]
        priorities.forEach {
            if (it == element) count += 1
        }

        // 중복값이 없는 경우
        if (count == 1) {
            answer = priorities.sortedArrayDescending().indexOf(element) + 1
        } else {
            val deque = ArrayDeque<Int>()
            deque.addAll(priorities.toList())
            // 중복값이 있는 경우
            while (deque.isNotEmpty()) {
                val removed = deque.removeFirst()
                val max = deque.maxOrNull()
                if(max == null){
                    answer += 1
                    break
                }
                if(removed < max){
                    deque.addLast(removed)
                }else{
                    answer += 1
                    if(location == 0) break
                }

                location -= 1
                if(location < 0){
                    location = deque.lastIndex
                }
            }
        }

        return answer
    }
}