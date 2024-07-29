import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
		String str="";
		String[] answer = {};
        List list = new ArrayList();
		for(int i=0;i<picture.length;i++) {
			for(int j=0;j<picture[i].length();j++) {
				for(int x=0;x<k;x++) {
					str+=picture[i].charAt(j);					
				}
			}
			for(int m=0; m<k;m++) {
				list.add(str);
			}
			str = "";
		}
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}
        return answer;
    }
}
