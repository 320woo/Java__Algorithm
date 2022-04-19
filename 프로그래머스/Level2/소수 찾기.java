import java.util.*;
class Solution {
    static Queue<Integer> queue = new LinkedList<>();
    static HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        
        int[] list = new int[numbers.length()];
        
        for(int i=0; i<list.length; i++){
            list[i] = numbers.charAt(i)-48;
        }
        Arrays.sort(list);
        int[] output = new int[list.length];
        boolean[] visited = new boolean[list.length];
        
        for(int i=0; i<list.length; i++){
           perm(list, output, visited, 0, list.length, i+1); 
        }
        
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            int num = (int)iter.next();
            System.out.println("list : "+ num);
            if(num >= 2)answer += check(num);
        }

        return answer;
    }
    public int check(int num){
        for(int i=2; i<num; i++){
            if(num%i == 0)return 0;
        }
        return 1;
    }
    
    public void perm(int[] list, int[] output, boolean[] visited , int depth, int n, int r){
        if(depth == r){
            print(output, r);
            return;
        }
        for(int i=0; i<n; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = list[i];
                perm(list, output, visited, depth+1, n, r);
                visited[i] = false;
            }   
        }
    }
    
    public void print(int[] output, int r){
        StringBuilder sb = new StringBuilder();
            for(int i=0; i<r; i++){
                sb.append(output[i]);
            }
            set.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
    }
    
}