import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] listB = new Integer[B.length];
        
        for(int i=0; i<B.length; i++){
            listB[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(listB, Collections.reverseOrder());

        for(int i=0; i<A.length; i++){
            answer += A[i] * listB[i];
        }
        
        return answer;
    }
}