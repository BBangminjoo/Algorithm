import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
		List list = new ArrayList();
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=50 && arr[i]%2==0) { // 50보다 크거나 같은 짝수라면
				list.add(arr[i]/2);
			}else if(arr[i]<50 && arr[i]%2!=0){  // 50보다 작은 홀수라면
				list.add(arr[i]*2);
			}else {
				list.add(arr[i]);
			}
		}

		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)list.get(i);
		}        
        return answer;
    }
}
