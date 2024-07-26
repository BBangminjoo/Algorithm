class Solution {
    public int solution(int a, int b) {
		int answer = 0;
		
		if(a%2!=0 && b%2!=0) { //a와 b가 모두 홀수라면 a2 + b2 점
			answer = a*a + b*b;
		}else if(a%2!=0 || b%2!=0) { // a와 b 중 하나만 홀수라면 2 × (a + b)
			answer = 2 * (a+b);
		}else if(a%2==0 && b%2==0) { // a와 b 모두 홀수가 아니라면 |a - b| 점
			answer = Math.abs(a-b);
		}
        return answer;
    }
}
