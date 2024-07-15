import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
		List list = new ArrayList();
		
		int a=0;
		// "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면
		// 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트
		for(int i=0;i<str_list.length;i++) {
			if(str_list[i].equals("l")) {
				a=i;
				for(int j=0; j<a; j++) {
					list.add(str_list[j]);
				}
				break;
				
			// 먼저 나오는 문자열이 "r"이라면 
			// 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트		
			}else if(str_list[i].equals("r")) {
				a=i;
				for(int j=a+1; j<str_list.length; j++) {
					list.add(str_list[j]);
				}
				break;
			}
		}
		
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}    
        return answer;
    }
}
