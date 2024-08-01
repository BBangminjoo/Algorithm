class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i=4;i<=n;i++) {
			// 각 숫자 i에 대해 2부터 i-1까지 숫자로 나누어 나머지가 0인경우 찾기
			for(int j=2;j<i;j++) {
				if(i%j==0) { // i가 j로 나누어떨어지면 합성수
					answer ++;
					break;
				}
			}
		}        
        return answer;
    }
}
