import java.util.*;
class Solution {
    static StringBuilder sb;
    public String solution(int n) {
        String answer = "";
        sb = new StringBuilder();
        //11 4 2 3 2
        //12 4 4 4 0
        //13 11 1 4 1
        //14 11 2 4 2
        //15 11 4 5 0
        //16 12 1 5 1
        //17 12 2 5 2
        if(n<=3){
            if(n == 1)answer = "1";
            else if(n == 2)answer = "2";
            else answer = "4";
        }
        else {
            Mok(n);
            answer = sb.reverse().toString();
        }
        return answer;
    }
    public void Mok(int num){
        if(num>=4){
            int mok = num / 3;
            int mod = num % 3;
            if(num%3 != 0){
                Mod(mod);
                Mok(mok);   
            }
            else if(num%3 == 0){
                Mod(3);
                Mok(mok-1);
            }
        }
        else {
            Mod(num);
        };
    }
    public void Mod(int num){
        if(num == 0 || num == 3)sb.append("4");
        else if(num == 1)sb.append("1");
        else if(num == 2)sb.append("2");
    }
}