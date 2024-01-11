import java.util.*
import kotlin.collections.ArrayDeque

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        val deque = ArrayDeque<Char>()
        s.forEach {
            deque.addLast(it)
        }

        if(getCorrect(deque)){
            answer += 1
        }
        deque.addLast(deque.removeFirst())

        repeat(s.length - 1){
            if(getCorrect(deque)){
                answer++
            }
            deque.addLast(deque.removeFirst())
        }

        return answer
    }

    fun getCorrect(s: ArrayDeque<Char>): Boolean {
        val stack = Stack<Char>()
        for (i in 0 until s.size) {
            if (stack.isEmpty() || s[i] == '{' || s[i] == '(' || s[i] == '[') {
                stack.push(s[i])
            } else {
                if (s[i] == ']' && stack.peek() == '[') {
                    stack.pop()
                } else if (s[i] == '}' && stack.peek() == '{') {
                    stack.pop()
                } else if (s[i] == ')' && stack.peek() == '(') {
                    stack.pop()
                } else {
                    break
                }
            }
        }

        return if(stack.isEmpty()){
            true
        } else {
            false
        }
    }
}