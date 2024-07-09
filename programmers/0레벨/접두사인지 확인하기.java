class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
		if(my_string.startsWith(is_prefix)) { // startsWith : 시작 문자열이 지정된 문자와 같은지 판별
			answer = 1;
		}else {
			answer = 0;
		}        
        return answer;
    }
}
