import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
		List list = new ArrayList();
		
		for(int i=n-1; i<num_list.length; i++) {
			list.add(num_list[i]);
		}
		
		answer = new int[list.size()];
		for(int j=0; j<answer.length; j++) {
			answer[j] = (int)list.get(j);
		}        
        
        return answer;
    }
}
