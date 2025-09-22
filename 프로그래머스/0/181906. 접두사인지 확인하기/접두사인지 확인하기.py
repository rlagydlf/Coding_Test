def solution(my_string, is_prefix):
    answer = 0
    for i in range(len(is_prefix)):
        if len(my_string)<len(is_prefix):
            return 0
        if my_string[i] == is_prefix[i]:
            answer += 1
        
    if answer == len(is_prefix):    
        return 1
    else:
        return 0
