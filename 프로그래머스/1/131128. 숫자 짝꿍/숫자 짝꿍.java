import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int [] count_x = new int[10];
        int [] count_y = new int[10];
        
        for(char i : X.toCharArray()) count_x[i - '0'] ++;
        for(char i : Y.toCharArray()) count_y[i - '0'] ++;
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0 ; i--){
            int common = Math.min(count_x[i], count_y[i]);
            for(int j = 0; j < common; j++){
                sb.append(i);
            }
        }
        String answer = sb.toString();
        if (answer.isEmpty()) return "-1";
        if (answer.startsWith("0")) return "0";
        return answer;
    }
}