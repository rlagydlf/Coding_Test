def solution(my_string):
    answer = []
    for i in my_string:
        if str.isdigit(i):
            answer.append(int(i))
    answer.sort()
    return answer