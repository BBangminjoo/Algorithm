class Solution {
    public int solution(int n) {
		int answer = 0;
		
		for(int i=0;i<n;i++) { // n까지  반복문
			answer++; // answer을 1씩 count
			// 3의 배수이거나 3을 포함하고 있으면 answer을 다음 숫자로 넘기기
			// 3을 포함할경우를 구할 때는 문자열로 변경해서 찾기 
			while(answer % 3 ==0 || String.valueOf(answer).contains("3")) {
				answer++; // 다음 숫자로 넘기기
			}
		}
        return answer;
    }
}
