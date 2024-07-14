import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
		List list = new ArrayList();
		for(int i=0; i<n; i++) {
			list.add(num_list[i]);
		}
		
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}        
        
        return answer;
    }
}
