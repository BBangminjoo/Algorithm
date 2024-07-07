import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
		String result = ""; 
		
		List list = new ArrayList();
		
		for(int i=0; i<intStrs.length; i++) {
			result = intStrs[i].substring(s, s+l);
			
			// 문자열 result를 정수로 변환하기 
			int su = Integer.parseInt(result);
			if(su>k) { // su가 k보다 크면
				list.add(su); // list에 담기
			}
			
			answer = new int[list.size()];
			for(int j = 0; j<answer.length; j++) {
				answer[j] = (int)list.get(j);
			}
            
		}        
        return answer;
    }
}
