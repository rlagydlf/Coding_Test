def solution(my_string, alp):
    answer = ''
    for i in my_string:
        if i == alp:
            i=alp.upper()
        answer += i
    return answer