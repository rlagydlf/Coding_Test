function solution(array) {
    var answer = [];
    var max = 0;
    var temp = 0;
    for(let i = 0; i<=array.length; i++){
        if(array[i]>=max){
            max = array[i];
            temp = i;
        }
    }
    answer.push(max,temp);
    return answer;
}