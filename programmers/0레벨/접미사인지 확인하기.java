class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
		if(my_string.endsWith(is_suffix)) { // endsWith() : 특정 문자나 문자열로 끝나는지 확인하는 함수
			answer = 1;
		}else {
			answer = 0;
		}        
        return answer;
    }
}
