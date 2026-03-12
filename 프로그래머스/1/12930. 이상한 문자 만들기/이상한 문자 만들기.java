import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String [] chars = s.split("");
        int cnt = 0;
        for(String str : chars){
            if(str.contains(" ")){
                cnt = 0;
                answer.append(" ");
            }
            else{
                if(cnt % 2 == 0)answer.append(str.toUpperCase());
                else answer.append(str.toLowerCase());
                cnt ++;
            }
        }

        return answer.toString();
    }
}