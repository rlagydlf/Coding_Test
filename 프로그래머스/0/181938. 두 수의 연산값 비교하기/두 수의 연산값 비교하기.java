class Solution {
    public int solution(int a, int b) {
        int answer = 2*a*b;
        String s = Integer.toString(a)+Integer.toString(b);
        if(answer>Integer.parseInt(s)){
            return answer;
        }
        else {
            return Integer.parseInt(s);
        }
       
    }
}