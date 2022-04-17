import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        boolean flag = true;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                answer+= s.charAt(i);
                flag = false;
            }
            else if(s.charAt(i) == ' '){
                answer+=" ";
                flag = true;
            }
            else if(flag == true){
                answer+= Character.toString(s.charAt(i)).toUpperCase();
                flag = false;
            }
            else answer+= s.charAt(i);
        }
        
        System.out.print(answer);
        
        return answer;
    }
}