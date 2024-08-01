import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		
		List list = new ArrayList();
		
		for(int i=0; i<emergency.length; i++) {
			list.add(emergency[i]);
		}
		Collections.sort(list,Collections.reverseOrder()); // 내림차순
		
		for(int j=0;j<emergency.length;j++) {
			for(int k=0;k<list.size();k++) {
				if(emergency[j]==(int)list.get(k)) {
					answer[j] = k+1; 
				}
			}
		}
        return answer;
    }
}
