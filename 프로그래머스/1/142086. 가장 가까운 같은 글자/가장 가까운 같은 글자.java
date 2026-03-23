import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map < Character, Integer > lastAlphabet = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!lastAlphabet.containsKey(ch)) answer[i] = -1;
            else answer[i] = i - lastAlphabet.get(ch);
            lastAlphabet.put(ch, i);
        }
        
        return answer;
    }
}