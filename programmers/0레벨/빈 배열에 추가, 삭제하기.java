import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
		List list = new ArrayList();

		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == true) {
				for (int k = 0; k < arr[i] * 2; k++) {
					list.add(arr[i]);
				}
			} else {
				for (int h = 0; h < arr[i]; h++) {
					list.remove(list.size() - 1);
				}
			}
		}
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}        
        return answer;
    }
}
