import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = String.valueOf(n);
        System.out.println(s);
        
        String[] list = s.split("");
        Arrays.sort(list, Collections.reverseOrder());
        
        String result = String.join("", list);
        answer = Long.parseLong(result);
        
        return answer;
    }
}