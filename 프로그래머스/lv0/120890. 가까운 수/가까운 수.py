def solution(array, n):
    answer = 0
    temp_array = []
    for i in array:
        temp_array.append(abs(n - i))

    min1 = n + min(temp_array)
    min2 = n - min(temp_array)

    if min2 in array: answer = min2
    else: answer = min1

    return answer