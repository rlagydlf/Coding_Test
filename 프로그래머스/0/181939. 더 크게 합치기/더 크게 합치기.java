class Solution {
    public int solution(int a, int b) {
        String s = Integer.toString(a) + Integer.toString(b);
        String s1 = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(s)<Integer.parseInt(s1)){
            int answer = Integer.parseInt(s1);
            return answer;
        }
        else {
            int answer = Integer.parseInt(s);
            return answer;
        }
    }
}