import java.util.*;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                result = 0;
                for(int k=0; k<arr2.length; k++){
                    result += arr1[i][k] * arr2[k][j];
                }
                queue.add(result);
            }
            
        }
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                if(!queue.isEmpty()){
                    answer[i][j] = queue.poll();   
                }
            }
        }
        
        return answer;
    }
}