import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            
            else if(!stack.isEmpty() && stack.peek() != c){
                stack.add(c);
            }
            
            else stack.add(c);
        }
        
        if(!stack.isEmpty())answer = 0;
        else answer = 1;

        return answer;
    }
}