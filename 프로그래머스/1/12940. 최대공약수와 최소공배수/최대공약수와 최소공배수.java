class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대 공약수 maxNum
        // 최소 공배수 minNum
        int maxNum = maxNumber(n, m);
        int minNum = (n * m) / maxNum;
        answer[0] = maxNum;
        answer[1] = minNum;
        
        return answer;
    }
    private int maxNumber(int a, int b){
        if(b == 0) return a;
        return maxNumber(b, a % b);
    }
}