import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
		List<Integer> list = new ArrayList(); // 정수형으로 제네릭 리스트 생성
		String str = "";
		for (int i = 0; i < my_string.length(); i++) {
			// 문자열 중에 숫자만 str에 담기
			if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				str += my_string.charAt(i);
			} else if(!str.equals("")){ // 공백이 아닌 것만
				list.add(Integer.parseInt(str)); // 정수형으로 바꾼 값을 list에 담기
				str = ""; // str초기화 (초기화해줘야 숫자가 붙어서 들어가지 않음)
			} 
			if(i==my_string.length()-1 && !str.equals("")) { // 마지막 값이 숫자일 경우, 공백이 아닐경우 
				list.add(Integer.parseInt(str));
                
			}
		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++) { //list의 숫자들을 
			sum +=list.get(i); // 하나씩 더해주기
		}   
        return sum;
    }
}
