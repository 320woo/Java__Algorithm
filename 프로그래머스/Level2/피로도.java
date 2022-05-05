import java.util.*;

class Solution {
    static int max = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        boolean[] visited = new boolean[dungeons.length];
        int[][] output = new int[dungeons.length][dungeons[0].length];
        
        perm(dungeons, output, visited, 0, dungeons.length , dungeons.length, k);
                
        answer = max;
        
        return answer;
    }
    
    public void perm(int[][] dungeons, int[][] output, boolean[] visited, int depth, int n, int r, int k){
        if(depth == r){
            max = Math.max(print(output,k), max);
        }
        
        for(int i=0; i<output.length; i++){
            if(!visited[i]){
                visited[i] = true;
                for(int j=0; j<output[0].length; j++){
                    output[depth][j] = dungeons[i][j];
                }
                perm(dungeons, output, visited, depth + 1, n, r, k);
                visited[i] = false;
            }
        }
        
    }
    
    public int print(int[][] output, int k){
        int count = 0;
        for(int i=0; i<output.length; i++){
            if(output[i][0] > k)continue;
            else {
                k = k - output[i][1];
                count++;
            }
        }
        
        return count;
    
    }
    
}