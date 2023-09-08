def solution(numbers):
    answer = []
    for i in range(0, len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            result = numbers[i] + numbers[j]
            if result not in answer:
                answer.append(numbers[i] + numbers[j])
    return sorted(answer)