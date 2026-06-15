class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];
        int answer = 0;
        for(int i = 1; i <= n ; i++){
            student[i] = 1;
        }
        for(int i : lost)student[i] --;
        for(int i : reserve)student[i] ++;
        for(int i = 1; i <= n; i++){
            if(student[i] == 0){
                if(student[i - 1] == 2){
                    student[i - 1]--;
                    student[i]++;
                }
                else if(student[i + 1] == 2){
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }
        for(int i = 1; i <= n ; i++){
            if(student[i] >= 1) answer++;
        }
        
        return answer;
    }
}