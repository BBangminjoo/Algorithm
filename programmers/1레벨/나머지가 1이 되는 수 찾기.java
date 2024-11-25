import java.util.*;

class Solution {
    public int solution(int n) {
		List<Integer> list = new ArrayList();
		for(int i=1; i<n; i++) {
			int x = i;
			if(n%x==1) {
				list.add(x);
			}
		}
		
		int[] answer = new int[list.size()]; 
		for(int i=0;i<answer.length; i++) {
			answer[i] += list.get(i);
		}
        return answer[0];
    }
}
