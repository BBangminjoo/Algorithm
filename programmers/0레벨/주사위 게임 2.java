class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
		// 세 숫자가 모두 다르다면 a+b+c
		if(a != b && a != c && b != c) {
			answer = a+b+c;
		}
		
		// 세 숫자가 모두 같다면
		// (a+b+c) * (a2+b2+c2) * (a3+b3+c3)
		else if(a==b && a==c && b==c) {
			answer =(a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
		}

		// 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 
		// (a+b+c) * (a2+b2+c2)
		else{
			answer =(a+b+c) * (a*a + b*b + c*c);
		}        
        return answer;
    }
}
