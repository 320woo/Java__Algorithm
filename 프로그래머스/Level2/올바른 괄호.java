class Solution {
    boolean solution(String s) {
        boolean answer = true;      
        int left = 0;
        int right = 0;
        boolean flag = false;
        
        //왼쪽 괄호보다 오른쪽 괄호가 커진 순간 false
        //카운팅 같아야함
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')left++;
            else if(s.charAt(i) == ')')right++;
            if(left<right)flag = true;
        }
        
        if(check(left,right,flag) && 
           (s.charAt(0) == '(' || 
           s.charAt(s.length()-1) == ')'))answer = true;
        else answer = false;

        return answer;
    }
    
    public boolean check(int left,int right, boolean flag){
        if(flag == true)return false;
        else if(left == right)return true;
        else return false;
    }
    
}