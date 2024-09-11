class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp!=0){
        if(hp>=5){
            hp=hp-5;
            answer++;
        }
        if(hp>=3&&hp<5){
            hp=hp-3;
            answer++;
        }
        if(hp>=1&&hp<3){
            hp=hp-1;
            answer++;
        }
        }
        return answer;
    }
}