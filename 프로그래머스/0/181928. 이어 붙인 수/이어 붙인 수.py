def solution(num_list):
    answer = 0
    hol = ""
    jack = ""
    
    for i in num_list:
        if i % 2 == 1:
            hol += str(i)
        else:
            jack += str(i)
    answer = int(hol) + int(jack)
    return answer