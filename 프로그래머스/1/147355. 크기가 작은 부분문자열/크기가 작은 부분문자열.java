import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = Long.parseLong(p);
        for(int i = 0; i <= t.length() - p.length(); i++){
            long tNumber = Long.parseLong(t.substring(i, i + p.length()));
            if(tNumber <= pNumber) answer++;
        }
        return answer;
    }
}