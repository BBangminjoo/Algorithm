import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
		List list = new ArrayList();
		String answer = "";
		for(int i=0; i<code.length(); i++) {
			char c = code.charAt(i); 
			list.add(String.valueOf(c)); // c를 문자열로 변환
		}
		
		for(int j=0; j<list.size(); j++) {
			if(j%q==r) { // list에 담은 문자열 중에 각 인덱스를 q를 나누었을 때 나머지가 r인 경우
				answer += list.get(j); // list에서 꺼내서 answer에 담기
			}
		}
        return answer;
    }
}
