def solution(arr, intervals):
    answer = []
    for interval in intervals:
        for i in range(interval[0], interval[1]+1):
            answer.append(arr[i])

    return answer