import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> list = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> result = new ArrayList(list);
        Collections.sort(result);
        
        answer = new int[result.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}