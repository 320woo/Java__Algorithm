import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = new String[s.length()];
        list = s.split(" ");
        int max = -9999;
        int min = 9999;

        for(int i=0; i<list.length; i++){
            max = Math.max(max,Integer.parseInt(list[i]));
            min = Math.min(min,Integer.parseInt(list[i]));
            System.out.print(list[i] + " ");
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}