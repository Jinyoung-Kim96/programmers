class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int stackCards1 = 0;
        int stackCards2 = 0;
        
        for(String word : goal){
            if(cards1.length > stackCards1 && word.equals(cards1[stackCards1]))stackCards1++;
            else if (cards2.length > stackCards2 && word.equals(cards2[stackCards2]))stackCards2++;
            else return "No";
        }
        
        return "Yes";
    }
}