import java.util.*;
class Solution {
    static int num = 0;
    public int solution(String[][] clothes) {
        int answer = 0;
        int size = clothes.length;
        
        boolean[] visited = new boolean[size];
        
        for(int i=1; i<=size; i++){
            combi(clothes, visited, 0, size, i);
        }    
        
        answer = num;
        
        return answer;
    }
    
    public void combi(String[][] clothes, boolean[] visited, int start, int n, int r){
        if(r == 0){
            print(clothes, visited, n);
            return;
        }
        
        for(int i=start; i<n; i++){
            visited[i] = true;
            combi(clothes, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }
    
    public void print(String[][] clothes, boolean[] visited, int n){
        Queue<String> queue = new LinkedList<>();
        int count = 0;
        
        for(int i=0; i<visited.length; i++){
            if(visited[i])count++;
        }
        
        for(int i=0; i<n; i++){
            if(visited[i]){
                if(!queue.contains(clothes[i][1]))queue.add(clothes[i][1]);
            }
        }
        
        if(queue.size() == count)num++;
        else return;
    }  
}