import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
		int[] answer = new int[5];
		List list = new ArrayList();

		Arrays.sort(num_list);
		
		for(int i=0; i<num_list.length; i++) {
			list.add(num_list[i]);
		}
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}
        return answer;
    }
}
