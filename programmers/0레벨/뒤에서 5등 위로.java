import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
		List list = new ArrayList();
		
		Arrays.sort(num_list);

		for (int j = 5; j < num_list.length; j++) {
			list.add(num_list[j]);
		}
		
		answer = new int[list.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = (int)list.get(i);
		}        
        return answer;
    }
}
