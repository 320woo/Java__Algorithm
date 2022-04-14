import java.util.*;
class Solution {
    static Stack<Integer> stack = new Stack<>();
    public int solution(int n) {
        int answer = 0;
        int start = count(n);
        
        while(true){
            boolean flag = false;
            flag = go(n+1, start);
            n++;
            if(flag == true){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
    public boolean go(int start, int count){
        if(count(start) == count){
            return true;
        }
        else return false;
    }
    
    public int count(int n){
        int count = 0;
        while(n>0){
            stack.add(n%2);
            n = n / 2;
        }
        
        while(!stack.isEmpty()){
            if(stack.peek() == 1){
                count++;
            }
            stack.pop();
        }
        
        return count;
    }
}