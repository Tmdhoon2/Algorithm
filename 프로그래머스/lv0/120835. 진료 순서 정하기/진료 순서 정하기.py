def solution(emergency):
    answer = []
    sorted_list = sorted(emergency, reverse=True)
    for i in emergency:
        answer.append(sorted_list.index(i) + 1)
    return answer