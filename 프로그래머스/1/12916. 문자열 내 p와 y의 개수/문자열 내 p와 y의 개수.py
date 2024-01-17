def solution(s):
    sum = 0
    
    for i in s.lower():
        if i == 'y':
            sum += 1
        elif i == 'p':
            sum -= 1

    return sum == 0