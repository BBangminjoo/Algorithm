import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0; 
        
        String str = Integer.toString(n);
        String[] str2 = str.split("");
        
        for(int i=0; i<str2.length; i++){
            temp = Integer.parseInt(str2[i]);
            answer += temp;
        System.out.println(answer);
        }

        return answer;
    }
}
