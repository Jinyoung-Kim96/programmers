class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String arr[] = phone_number.split("");
        for(int i = 0; i < arr.length - 4 ; i++){
            arr[i] = "*";
        }
        for(String s: arr){
            answer += s;
        }
        return answer;
    }
}