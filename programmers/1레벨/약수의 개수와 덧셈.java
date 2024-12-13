// 약수의 개수와 덧셈

/* 두 정수 left와 right가 매개변수
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return*/
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
		// 1. left ~ right 사이에 있는 수 구하기
		for(int i=left;i<=right;i++) {
			int count =0;
			// 2. 약수구하기
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++; // 3. 약수갯수구하기
				}
			}
			if(count %2==0) { // 4. 짝수일경우
				answer += i;
			}else { 		  // 5. 홀수일경우
				answer -= i;
			}
		}        
        return answer;
    }
}
