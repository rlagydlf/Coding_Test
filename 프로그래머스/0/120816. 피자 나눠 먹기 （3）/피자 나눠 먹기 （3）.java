class Solution {
    public int solution(int slice, int n) {
        int answer = n%slice;
        switch(answer){
            case 0 : return n/slice;
            default : return n/slice+1;
                
        }
    }
}