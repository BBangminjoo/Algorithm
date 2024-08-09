class Solution {
    public int solution(String my_string) {
		// 문자열 공백기준으로 자르기
		String[] str = my_string.split(" ");
		// 첫 번째 숫자를 초기 결과값으로 설정
		int answer = Integer.parseInt(str[0]);
		
		int op = 0; // 연산자에 따른 연산값 저장 변수
		for(int i=1;i<str.length;i++) {
			// 더해지거나 빼지는 피연산자
			if(i%2==0) { // 0번째, 2번째 자리... 
                // 연산자에 따라 피연산자를 곱하고 결과에 더함
				op *= Integer.parseInt(str[i]);
				answer += op;
			}else if(str[i].equals("+")) {
				op = 1; // 양수로 설정
			}else if(str[i].equals("-")) {
				op = -1; // 음수로 설정
			}
		}        
        return answer;
    }
}
