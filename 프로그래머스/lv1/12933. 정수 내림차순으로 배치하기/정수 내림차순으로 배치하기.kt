class Solution { fun solution(n: Long): Long = StringBuilder().apply {n.toString().toList().sortedDescending().forEach {append(it)}}.toString().toLong()}
