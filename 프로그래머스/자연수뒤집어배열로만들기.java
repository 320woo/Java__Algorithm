package Programmers;
import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int k = 0;
        long num = n;
        
        if(n == 0){
            answer = new int[1];
            answer[0] = 0;
        }
        
        else {
            while(n>0){
            k++;
            n = n/10;
        }
        
        answer = new int[k];
        
        for(int i=0; i<k; i++){
            answer[i] = (int)(num%10);
            num = num/10;
            }
        }
        
        return answer;
    }
}