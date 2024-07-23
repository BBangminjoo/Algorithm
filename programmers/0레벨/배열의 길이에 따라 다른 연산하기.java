import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
		int[] answer = {};
		List list = new ArrayList();
		for(int k=0; k<arr.length; k++) {
			list.add(arr[k]);
		}
		if(arr.length %2 != 0) { // 홀수라면
			for(int i=0; i<arr.length; i+=2) {
				list.set(i, arr[i]+n);
			}
		}else { // 짝수라면
			for(int j=1; j<arr.length; j+=2) {
				list.set(j, arr[j]+n);
			}
		}
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}
        return answer;
    }
}
