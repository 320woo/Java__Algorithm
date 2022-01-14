class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pscore = 0;
        int yscore = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pscore++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yscore++;
            }
        }
        
        if(pscore == 0 && yscore == 0)answer = true;
        else if(pscore == yscore)answer = true;
        else answer = false;
        
        return answer;
    }
}