// 두 정수 사이의 합
// a, b 사이에 속한 모든 정수의 합
// a, b가 같은 경우 둘 중 아무 수 리턴

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
		if (a < b || a == b) { // a가 b보다 작거나 a와 b가 같을 경우

			for (int i = a; i <= b; i++) {
				if (a == b) {
					answer = a;
				} else {
					answer += i;
				}
			}
		}
		
		else { // a가 b보다 클경우
			for(int i = b; i<= a; i++) {
				answer += i;
			}
		}    
        return answer;
    }
}
