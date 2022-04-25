import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[progresses.length];
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();
        
        for(int i=0; i<days.length; i++){
            int mod = 100 - progresses[i];
            if(mod >= speeds[i]){
                if(mod % speeds[i] == 0)days[i] = mod / speeds[i];
                else if(mod % speeds[i] != 0)days[i] = mod / speeds[i] + 1;
            }
            else {
                days[i] = 1;
            }
        }
        
        stack.add(days[0]);
        result.add(1);
        
        for(int i=1; i<days.length; i++){
            if(stack.peek() < days[i]){
                stack.add(days[i]);
                result.add(1);
            }
            else if(stack.peek() >= days[i]){
                result.add(result.pop()+1);
            }
        }
        
        answer = new int[result.size()];
        
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = result.pop();
        }
        
        return answer;
    }
}