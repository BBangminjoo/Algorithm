import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
		List<Integer> stk = new ArrayList<>();
		int i=0;
		
		while(i<arr.length) { // i가 arr의 길이보다 작을 경우
			if(stk.isEmpty()) {
				stk.add(arr[i]);
				i++;
			}else if(stk.get(stk.size()-1)==arr[i]) {
				stk.remove(stk.size()-1);
				i++;
			}else if(stk.get(stk.size()-1)!=arr[i]) {
				stk.add(arr[i]);
				i++;
			}
		}
		if(stk.isEmpty()) { // stk가 비어있는 경우 -1을 포함한 배열 반환
			stk.add(-1);
			answer = new int[1];
			for(int k=0; k<answer.length;k++) {
				answer[k] = (int)stk.get(k);
			}
		}
		answer = new int[stk.size()];
		for(int j=0; j<stk.size(); j++) {
			answer[j] = stk.get(j);
		}        
        return answer;
    }
}
