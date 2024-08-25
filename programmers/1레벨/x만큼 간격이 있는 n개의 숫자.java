import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
		long sum=0;
		long[] answer = new long[n];
		
		List list = new ArrayList();
		
		
		for(int i=0;i<n;i++) {
			sum+=x;
			list.add(sum);
		}
		for(int j=0;j<answer.length;j++) {
			answer[j] = (long)list.get(j);
		}
        return answer;
    }
}
