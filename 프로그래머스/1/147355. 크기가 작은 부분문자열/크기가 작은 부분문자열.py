import math

def solution(t, p):
    answer = 0
    for i in range(0, len(t) - len(p) + 1):
        temp = 0
        for j in range(0, len(p)):
            temp = temp + int(t[i+j]) * int(math.pow(10, len(p) - 1 - j))
        if temp <= int(p):
            answer += 1
        
    return answer