import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
       // 문제 해결 : n번째 이후의 원소 + n번째 이전의 원소 
        int[] answer = {};
		List list = new ArrayList();
		for(int i=n; i<num_list.length; i++) {
			list.add(num_list[i]); // n번째 이후의 원소들
		}
		for(int j=0; j<n; j++) {
			list.add(num_list[j]); // n번째 이전의 원소들
		}
		
		answer = new int[list.size()];
		for(int k=0; k<answer.length; k++) {
			answer[k] = (int)list.get(k);
		}        
        return answer;
    }
}
