import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
		List list = new ArrayList();
		for(int i=0; i<my_string.length();i++) {
			if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57) {
				list.add(my_string.charAt(i));
			}
		}        
		Collections.sort(list);
		System.out.println(list.toString());
		answer = new int[list.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = (char)list.get(i)-48;
		}
        
        return answer;
    }
}
