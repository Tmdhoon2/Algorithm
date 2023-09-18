def solution(prices):
    answer = []
    for i in range(0, len(prices)):
        temp = 0
        for j in range(i+1, len(prices)):
            temp += 1
            if prices[i] >  prices[j]:
                break
        answer.append(temp)

    return answer