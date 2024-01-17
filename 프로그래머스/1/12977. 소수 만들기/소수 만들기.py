import math

def solution(nums):
    answer = 0
    length = len(nums)
    for i in range(0, length - 2):
        for j in range(i+1, length - 1):
            for k in range(j+1, length):
                sum = nums[i] + nums[j] + nums[k]
                if get_count(sum) == 0:
                    answer += 1
            

    return answer

def get_count(n):
    count = 0
    for i in range(2, n):
        if n % i == 0:
            count += 1
    return count
    