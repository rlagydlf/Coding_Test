function solution(age) {
    let answer = '';
    let strAge = age.toString();

    for (let i = 0; i < strAge.length; i++) {
        let code = strAge.charCodeAt(i) + 49;
        answer += String.fromCharCode(code);
    }

    return answer;
}
