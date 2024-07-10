import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
		int[] answer = {};
		List list = new ArrayList();
		for(int i=1; i<=n; i++) {
			if(i%k==0) {
				list.add(i);
			}
		}
		answer = new int[list.size()];
		for(int j=0; j<answer.length; j++) {
			answer[j] += (int)list.get(j);
		}
        return answer;
    }
}
