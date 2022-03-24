class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] sort = new int[sizes.length][sizes[0].length];
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                sort[i][0] = sizes[i][0];
                sort[i][1] = sizes[i][1];
            }
            else {
                sort[i][0] = sizes[i][1];
                sort[i][1] = sizes[i][0];
            }
        }
        
        int x = 0;
        int y = 0;
        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[0].length; j++){
                x = Math.max(x,sort[i][0]);
            }
            
            for(int j=0; j<sizes[0].length; j++){
                y = Math.max(y,sort[i][1]);
            }
        }
        
        answer = x*y;
        
        return answer;
    }
}