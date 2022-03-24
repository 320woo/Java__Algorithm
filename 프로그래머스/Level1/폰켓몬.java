import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;
        
        HashSet<Integer> map = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            map.add(nums[i]);
        }
        
        Iterator iter = map.iterator();
        int size = 0;
        while(iter.hasNext()){
            iter.next();
            size++;
        }
        
        if(size>count)answer = count;
        else answer = size;
        
        return answer;
    }
}