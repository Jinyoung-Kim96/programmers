class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        String answer = "";
        for(String s : seoul){
            if(s.equals("Kim")){
                answer = String.format("김서방은 %d에 있다",count);
                return answer;
            }
            count ++;
        }
        return "";
    }
}
