import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int z = 0; z < commands.length; z++){
            int i = commands[z][0];
            int j = commands[z][1];
            int k = commands[z][2];
            ArrayList <Integer> arr = new ArrayList<>();
            for(int n = i - 1; n < j; n++){
                arr.add(array[n]) ;
            }
            Collections.sort(arr);
            answer[z] = arr.get(k - 1);
        }
        return answer;
    }
}