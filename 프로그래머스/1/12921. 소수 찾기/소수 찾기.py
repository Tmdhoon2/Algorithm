import math

list = []

def solution(n):
    answer = 0
    
    for i in range(n + 1):
        list.append(True)
        
    for i in range(2, int(math.sqrt(n)) + 1):
        if list[i]:
            j = 2
            while i * j <= n:
                list[j * i] = False;
                j += 1
    
    for i in range(2, n + 1):
        if list[i]:
            answer += 1
    
    
    return answer