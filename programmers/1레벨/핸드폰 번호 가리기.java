import java.util.*;
class Solution {
    public String solution(String phone_number) {
		String answer = "";
		String str = "";
		List<Integer> list = new ArrayList();
		for(int i=0;i<phone_number.length()-4;i++) { // 나머지 숫자를 전부 *으로 가린 문자열
			str += phone_number.replaceAll(phone_number, "*");
		}
		for(int i=str.length();i<phone_number.length();i++) { // 전화번호의 뒷 4자리를 제외
			list.add(phone_number.charAt(i)-48);
		}
		int[] str2 = new int[list.size()];
		for(int i=0;i<str2.length;i++) {
			str2[i]+=list.get(i);
		}
		String four = Arrays.toString(str2).replace(",", "").replace(" ", "").replace("[", "").replace("]", "");
		
		answer = str + four;
        return answer;
    }
}
