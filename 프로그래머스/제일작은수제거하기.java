package Programmers;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 0;
        int[] copy = arr.clone();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //배열 사이즈가 1개일 경우
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        //배열 사이즈가 2개 이상일 경우
        else {
            answer = new int[arr.length];
            Arrays.sort(copy);
            min = copy[0];
            int k = arr.length;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == min){
                    k--;
                    continue;
                }
                list.add(arr[i]);
            }
            
            answer = new int[k];
            
            for(int i=0; i<k; i++){
                answer[i] = list.get(i);
            }
            
        }
        
        return answer;
    }
}
