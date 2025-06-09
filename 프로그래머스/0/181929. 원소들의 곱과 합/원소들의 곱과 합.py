def solution(num_list):
    s = sum(num_list)
    m = 1
    for num in num_list:
        m *= num
    return 1 if m < s ** 2 else 0