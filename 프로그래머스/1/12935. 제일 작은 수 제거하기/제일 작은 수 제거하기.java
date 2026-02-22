class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int numberMin = arr[0];
        for(int i : arr){
            numberMin = numberMin > i ? i : numberMin;
        }
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i : arr){
            if(i != numberMin) answer[idx++] = i;
        }
        return answer;
    }
}