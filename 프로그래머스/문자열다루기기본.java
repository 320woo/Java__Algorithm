package Programmers;
import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //Character.UpperCase()로 대문자로 변환하여 if문 줄이기 가능
        
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                  (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) answer = false;
            }
        }
        
        else answer = false;
        
        return answer;
    }
}
