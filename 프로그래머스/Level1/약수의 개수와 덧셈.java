import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int count = 0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j == 0 && i/j != j)count+=2;
                if(i%j == 0 && i/j == j)count+=1;
            }
            if(count%2==0)answer+=i;
            if(count%2==1)answer-=i;
        }
        
        return answer;
    }
}