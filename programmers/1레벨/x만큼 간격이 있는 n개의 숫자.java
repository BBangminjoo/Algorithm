import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		List list = new ArrayList();
		
		
		for(int i=x;i<1000;i+=x) {
			list.add(i);
		}
		for(int j=0;j<answer.length;j++) {
			answer[j] = (int)list.get(j);
		}
        return answer;
    }
}
