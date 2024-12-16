//문자열 다루기 기본

/* 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
* s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴*/

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
		if(s.length()==4 || s.length()==6) { // 문자열 s의 길이가 4 혹은 6이 아닐경우
			for(int i=0;i<s.length();i++) {
				if(!(s.charAt(i)>='0' && s.charAt(i)<='9')) { // 숫자로만 구성이 아닌경우
					answer = false;
					break;
				}
			}
		}else {
			answer = false;
		}        
        return answer;
    }
}
