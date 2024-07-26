import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
		List answer = new ArrayList();
		// arr의 원소 중 delete_list의 원소를 모두 삭제
		for (int i = 0; i < arr.length; i++) {
			answer.add(arr[i]);
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) {
					answer.remove(Integer.valueOf(arr[i]));
				}
			}
		}
		int[] result = new int[answer.size()];
		for(int i=0; i<result.length; i++) {
			result[i] = (int)answer.get(i);
		}        
        return result;
    }
}
