def solution(bandage, health, attacks):
    answer = health
    max_time = bandage[0]
    recovery = bandage[1]
    bonus_recovery = bandage[2]
    first_attacked = attacks[0]

    answer += first_attacked[0] - 1 * recovery

    if (first_attacked[0] > max_time):
        answer += bonus_recovery

    if answer >= health:
        answer = health

    answer -= first_attacked[1]

    for i in range(1, len(attacks)):
        previous_time = attacks[i - 1][0]
        attacked_time = attacks[i][0]
        damage = attacks[i][1]

        recovery_hp = attacked_time - previous_time - 1

        answer += recovery_hp * recovery

        if recovery_hp >= max_time:
            answer += (recovery_hp / max_time) * bonus_recovery

        if answer >= health:
            answer = health

        answer -= damage

        if answer <= 0:
            answer = -1
            break

    if answer <= 0:
        answer = -1

    return answer