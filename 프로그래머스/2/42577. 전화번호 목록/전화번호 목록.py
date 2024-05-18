def solution(phone_book):
    answer = True
    phone_book.sort()
       
    for i in range(len(phone_book) - 1):
        sliced = phone_book[i]
        next = phone_book[i + 1][0:len(phone_book[i])]
        if sliced == next:
            answer = False
            break

    return answer