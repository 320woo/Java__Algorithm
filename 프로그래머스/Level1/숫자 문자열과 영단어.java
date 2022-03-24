import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int hash = 0;
        String splus = s+" ";
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                queue.add((int)s.charAt(i)-48);
                continue;
            }
            else if(splus.charAt(i) == 'z' && splus.charAt(i+1) == 'e')queue.add(0);
            else if(splus.charAt(i) == 'o' && splus.charAt(i+1) == 'n')queue.add(1);
            else if(splus.charAt(i) == 't' && splus.charAt(i+1) == 'w')queue.add(2);
            else if(splus.charAt(i) == 't' && splus.charAt(i+1) == 'h')queue.add(3);
            else if(splus.charAt(i) == 'f' && splus.charAt(i+1) == 'o')queue.add(4);
            else if(splus.charAt(i) == 'f' && splus.charAt(i+1) == 'i')queue.add(5);
            else if(splus.charAt(i) == 's' && splus.charAt(i+1) == 'i')queue.add(6);
            else if(splus.charAt(i) == 's' && splus.charAt(i+1) == 'e')queue.add(7);
            else if(splus.charAt(i) == 'e' && splus.charAt(i+1) == 'i')queue.add(8);
            else if(splus.charAt(i) == 'n' && splus.charAt(i+1) == 'i')queue.add(9);
        }
        
        String result = "";
        while(!queue.isEmpty()){
            result+=queue.poll();
        }
        
        answer = Integer.parseInt(result);
    
        return answer;
    }
}