class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameNum = 0;
        int otherNum = 0;
        char x = ' ';
        
        for(int i = 0; i < s.length(); i++){
            if(sameNum == 0) x = s.charAt(i);
            if(s.charAt(i) == x){
                sameNum++;
            }else{
                otherNum++;
            }
            if(sameNum == otherNum){
                answer++;
                sameNum = 0;
                otherNum = 0;
            }
            
        }
        if(sameNum > 0) answer++;
        return answer;
    }
}