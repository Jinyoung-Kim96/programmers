class Solution {
    public boolean solution(int x) {
        int temp = 0;
        String [] arr = String.valueOf(x).split("");
        for(String s : arr){
            temp += Integer.valueOf(s);
        }
        boolean answer = x % temp == 0? true : false;
        return answer;
    }
}