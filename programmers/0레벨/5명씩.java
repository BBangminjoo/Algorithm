import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
		List list = new ArrayList();
		
		for(int i=0; i<names.length; i+=5) {
			list.add(names[i]);
		}
		
		
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}        
        return answer;
    }
}
