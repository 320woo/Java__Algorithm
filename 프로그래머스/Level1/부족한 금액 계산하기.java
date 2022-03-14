class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        for(int i=1; i<=count; i++){
            sum += price*i;
        }
        
        
        if(sum > money)answer = sum - money;
        if(sum <= money)answer = 0;
        System.out.println(sum);
        
        return answer;
    }
}