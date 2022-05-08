import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int sum = brown + yellow;
        int left = 0;
        
        answer = new int[2];
        
        for(int i=3; i<=Math.sqrt(sum); i++){
            if(sum % i == 0){
                left = sum / i;
            }
            System.out.println(left + " " + i);
            if(go(left, i) == yellow){
                answer[0] = left;
                answer[1] = i;
            }
        }
        
        return answer;
    }
    
    public int go(int left, int i){
        return (i-2) * (left - 2);
    }
    
}