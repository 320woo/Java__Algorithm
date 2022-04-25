class Solution {
    public int solution(String name) {
        int answer = 0;

        for(int i=0; i<name.length(); i++){
            answer += topdown(name.charAt(i), i);
        }
        
        answer += leftright(name);
        
        return answer;
    }
    public int leftright(String name){
        int left = 0;
        int right = 1;
        int side = side(name);
        
        for(int i=0; i<name.length()-1; i++){
            left += checkleft(name, i);
        }    
        
        for(int i=0; i<name.length()-1; i++){
            right += checkright(name, i);
        }
        int result = Math.min(side, Math.min(left,right));
        
        return result;
    }
    
    public int side(String name){
        int count1 = 0;
        int count2 = 0;
        int save1 = 0;
        int save2 = 0;
        
        if(name.length() % 2 == 0){
            for(int i=1; i<name.length()/2; i++){
                if(name.charAt(i) != 'A'){
                    count2++;
                    save1 = i;
                }
            }
            count1 += save1 * 2;
            
            for(int i = name.length()/2; i<name.length(); i++){
                if(name.charAt(i) != 'A'){
                    count1++;
                    save2 = i;
                }
            }
            
            count2 += save2 * 2;
            
        }
        
        else if(name.length() % 2 == 1){
            for(int i=1; i<name.length()/2 + 1; i++){
                if(name.charAt(i) != 'A'){
                    save1 = i;
                    count2++;
                }
            }
            
            count1 += save1 * 2;
            
            for(int i = name.length()/2 + 1; i<name.length(); i++){
                if(name.charAt(i) != 'A'){
                    count1++;
                    save2 = i;
                }
            }
            
            count2 += save2 * 2;
            
        }
        
        return Math.min(count1, count2);
        
    }
    
    public int checkleft(String name, int alpha){
        boolean flag = true;
        
        loop:
        for(int i=alpha; i<name.length(); i++){
            if(name.charAt(i) != 'A'){
                flag = false;
                break loop;
            }
        }
        
        if(flag == false)return 1;
        else return 0;
    }
    
    public int checkright(String name, int alpha){
        boolean flag = true;
        
        loop:
        for(int i=name.length()-2-alpha; i>=1; i--){
            if(name.charAt(i) != 'A'){
                flag = false;
                break loop;
            }
        }
        
        if(flag == false)return 1;
        else return 0;
    }
    
    public int topdown(char alpha, int i){
        if(alpha == 'A'){
            return 0;
        }
        if(alpha <= 'N'){
            return alpha - 'A';
        }
        
        else if(alpha > 'N'){
            return 'Z' - alpha + 1;
        }
        
        return 0;
    }
    
}