import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;    
        Arrays.sort(arr);
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<arr.length-1; i++){
            if(queue.isEmpty() == true){
                queue.add(arr[i+1] * arr[i] / GCD(arr[i+1],arr[i]));
            }
            else {
                if(arr[i+1] > queue.peek()){
                    queue.add((arr[i+1] * queue.peek()) / GCD(arr[i+1], queue.peek()));
                    queue.remove();
                }
                else {
                    queue.add((arr[i+1] * queue.peek()) / GCD(queue.peek(), arr[i+1]));
                    queue.remove();
                }
            }
        }
        
        answer = queue.peek();
        
        return answer;
    }
    
    //num2 > num1
    public int GCD(int num2, int num1){
        if(num2 % num1 == 0)return num1;
        else {
            return GCD(num1, num2%num1);
        }
    }
}