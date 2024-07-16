import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
		String[] answer = {};
		List list = new ArrayList();
		
		for(int i=0; i<strArr.length; i++) {
			if(i%2!=0) { // 홀수번째 자리면
				list.add(strArr[i].toUpperCase());
			}else if(i%2==0) { // 짝수번째 자리면
				list.add(strArr[i].toLowerCase());
			}
		}
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}
        return answer;
    }
}
