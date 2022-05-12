import java.util.*;
class Solution {
    static Stack<Integer> stack;
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        stack = new Stack<>();
        char[] alpha = new char[skill.length()];
        
        for(int i = 0; i< skill.length(); i++){
            alpha[i] = skill.charAt(i);
        }
        
        for(int i=0; i<skill_trees.length; i++){
            answer += check(alpha, skill_trees[i]);
            System.out.println(i + " " + answer);
            stack.clear();
        }
        
        return answer;
    }
    
    public int check(char[] alpha, String skill_tree){
        if(!first(alpha, skill_tree))return 0;
        for(int i=0; i<alpha.length; i++){
            for(int j=0; j<skill_tree.length(); j++){
                if(alpha[i] != skill_tree.charAt(j))continue;
                else {
                    if(bool(j) == false) 
                    {
                        return 0;
                    }
                }
            }
        }
        return 1;     
    }
    
    public boolean first(char[] alpha, String skill_tree){
        boolean flag = false;
        for(int i=0; i<alpha.length; i++){
            for(int j=i; j>-1; j--){
                String s = Character.toString(alpha[i]);
                String s1 = Character.toString(alpha[j]);
                System.out.println(s + " " + s1);
                if(skill_tree.contains(s)){
                    if(skill_tree.contains(s1))continue;
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean bool(int j){
        boolean flag = true;
        if(stack.isEmpty()){
            stack.add(j);
        }
        
        else if(stack.peek() < j){
            stack.pop();
            stack.add(j);
        }
        
        else {
            flag = false;
        }
        
        return flag;
    }
    
}