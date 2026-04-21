import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int lottos_zero = 0;
        int lottos_count = 0;
        for (int i =0; i < 6; i++){
            if(lottos[i] == 0) lottos_zero ++;
        }
        for(int i = 0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(lottos[i] == win_nums[j])lottos_count++;
            }
        }
        int[] answer = {lottos_lank(lottos_count+lottos_zero),lottos_lank(lottos_count)};
        return answer;
    }
    private int lottos_lank(int num){
        switch(num){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6; 
        }
          
    }
}