def solution(d, budget):
    answer = 0
    sum = 0
    for i in sorted(d):
        sum += i
        if sum <= budget:
            answer += 1
    return answer