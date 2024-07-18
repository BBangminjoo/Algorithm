import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
		String[] answer = {};
		List list = new ArrayList();
		
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				list.add(strArr[i]);
			}
		}
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}
        
        return answer;
    }
}
