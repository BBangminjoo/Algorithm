import java.util.*;

class Solution {
    public int[] solution(String myString) {
		String[] answer = myString.split("x", -1); // [o, oo, o, , o, ] 구분자가 문자열의 끝에 위치할 때 -1을 해줘야 함.
		List list = new ArrayList();
		int[] result = {};
		
		
		for(int i=0; i<answer.length; i++) {
			list.add(answer[i].length());
		}
		
		result = new int[list.size()];
		for(int i=0; i<result.length;i++) {
			result[i] = (int)list.get(i);
		}
        return result;
    }
}
