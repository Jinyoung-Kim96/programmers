class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n); 
        
        answer = sqrt == (long)sqrt ? (long)Math.pow(sqrt+1,2) : -1;
        return answer;
    }
}