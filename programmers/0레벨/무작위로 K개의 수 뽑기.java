import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
		int[] answer = {};
		List list = new ArrayList();
		arr=Arrays.stream(arr).distinct().toArray(); // 배열 중복된 값 제거
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		answer = new int[k];
		for(int i=0;i<answer.length;i++) {
			if(list.size()<k) {
				list.add(-1);
			}
			answer[i]=(int)list.get(i);
		}
        return answer;
    }
}
