import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            ArrayList <Integer> numList = new ArrayList<>(); 
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    numList.add(j);
                }
            }
            answer = numList.size() % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }
}