class Solution {
    public int solution(int[][] sizes) {
        int temp = 0;
        int rowNum = 0;
        int colNum = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(rowNum < sizes[i][0]) rowNum = sizes[i][0];
            if(colNum < sizes[i][1]) colNum = sizes[i][1];
        }
        return rowNum * colNum;
    }
}
