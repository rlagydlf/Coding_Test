class Solution {
    public String solution(String my_string, int[][] queries) {
       for (int[] query : queries) {
            StringBuilder sb = new StringBuilder(my_string.substring(query[0],query[1]+1));
            my_string = my_string.substring(0,query[0]) 
                          + sb.reverse() 
                          + my_string.substring(query[1]+1);
            
        }
        return my_string;
    }
}