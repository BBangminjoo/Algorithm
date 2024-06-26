class Solution {
    public int solution(int n) {
        int answer = 0;
        
		// n이 홀수라면 
		if(n%2!=0) {
			// n이하의 홀수인 모든 양의 정수의 합
			for(int i=1; i<=n; i+=2) {
				answer += i;
			}
		
		// n이 짝수라면 
		}else {
			// n이하의 짝수인 모든 양의 정수의 제곱의 합
			for(int i=0; i<=n; i+=2) {
				answer += i*i;
			}
		}        
        return answer;
    }
}
