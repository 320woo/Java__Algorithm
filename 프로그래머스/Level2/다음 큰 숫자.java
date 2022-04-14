class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        
        //어이없네 ....

        while(true){
            n++;
            if(count == Integer.bitCount(n)){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}