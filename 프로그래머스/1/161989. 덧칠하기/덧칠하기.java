class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;
        for(int i : section){
            if(i > paint){
                answer += 1;
                paint = i + m - 1;
            }
        }
        return answer;
    }
}