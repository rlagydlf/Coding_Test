class Solution {
    public int solution(int[][] triangle) {
        
        //바닥부터 꼭대기로 올라오면서 반복
        for(int i = triangle.length-1; i>=1;i--){
            //왼쪽부터 오른쪽으로 이동하면서 반복
            for(int j = 1; j<triangle[i].length; j++){
                //아래 자식중에서 더 큰값이랑 더한다
                triangle[i-1][j-1]+=Math.max(triangle[i][j-1],triangle[i][j]);
            }
        }
        //결국 꼭대기에 있는수가 합이 가장 큰수
        return triangle[0][0];
        
    }
}