def solution(food):
    answer = ''
    for i in range(1, len(food)):
        count = int(food[i] / 2)
        for j in range(count):
            answer += str(i)

    answer += str(0)

    for i in range(len(food) - 1, 0, -1):
        count = int(food[i] / 2)
        for j in range(count):
            answer += str(i)

    return answer