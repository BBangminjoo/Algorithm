import java.util.*;

class Solution {
    public String[] solution(String myStr) {
		String[] answer = {};
		List list = new ArrayList();
		
		// a,b,c를 구분자로 쓰고 문자열에 a,b,c는 배열에 넣지 않기
		// a랑 b를 모두 c로 바꾼 다음 c를 구분자로 해서 잘라서 각 배열에 담을 거다
		myStr = myStr.replaceAll("a", "c");
		myStr = myStr.replaceAll("b", "c");
		
		String[] arr = myStr.split("c");
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].trim().isEmpty()) {
				list.add(arr[i]);
			}
		}
		if(list.isEmpty()) {
			list.add("EMPTY");
		}
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] =(String)list.get(i);
		}
        return answer;
    }
}
