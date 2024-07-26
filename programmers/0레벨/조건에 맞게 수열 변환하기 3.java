import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
		int[] answer = {};
		
		List list = new ArrayList();
		for(int i=0; i<arr.length; i++) {
			if(k%2==0) { //k가 짝수라면
				list.add(arr[i]+k);
			}else { //k가 홀수라면
				list.add(arr[i]*k);
			}
		}
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}
        return answer;
    }
}
