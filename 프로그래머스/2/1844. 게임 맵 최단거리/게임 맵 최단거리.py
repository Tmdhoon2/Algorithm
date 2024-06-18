def bfs(array, max_h, max_w, w_list, h_list):
    queue = []
    queue.append({
        'w': 0,
        'h': 0,
    })

    while len(queue) > 0:
        popped = queue.pop(0)
        current_w = popped['w']
        current_h = popped['h']
        element_current = array[current_h][current_w]

        for i in range(0, 4):
            next_w = w_list[i] + current_w
            next_h = h_list[i] + current_h

            if next_w in range(0, max_w) and next_h in range(0, max_h):
                element_next = array[next_h][next_w]
                if element_next == 1:
                    queue.append({
                        'w': next_w,
                        'h': next_h,
                    })
                    array[next_h][next_w] = element_current + 1
                    array[current_h][current_w] = 0

        # for i in range(len(array)):
        #     print(array[i])
        # print("\n")

        if array[max_h - 1][max_w - 1] != 1:
            break

    result = array[max_h - 1][max_w - 1]

    if result == 1:
        return -1
    else:
        return result


def solution(maps):
    answer = 0
    # for i in range(len(maps)):
    #     print(maps[i])
    return bfs(maps, len(maps), len(maps[0]), [-1, 0, 1, 0], [0, -1, 0, 1])