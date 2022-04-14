class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            answer += go(i,n);   
        }
        
        return answer;
    }
    
    public int go(int start, int n){
        int sum = 0;
        
        while(true){
            sum += start;
            start++;
            if(sum == n)return 1;
            if(sum>n)return 0;
        }
        
    }
}