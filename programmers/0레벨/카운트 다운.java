import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        
        List list = new ArrayList();
        int[] answer = {};
        int result = start_num - end_num + 1 ;
        
        for(int i=start_num; i>=end_num; i--){
            list.add(i);
        }
        answer = new int[list.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = (int)list.get(j);
        }
       return answer;
    }
}
