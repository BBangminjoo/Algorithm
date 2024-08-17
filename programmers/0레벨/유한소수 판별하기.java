class Solution {
    public int solution(int a, int b) {
		int answer = 0;
		
		while(b%2==0 || b%5==0) {
			if(b%2==0) {
				b/=2;
			}
			System.out.println(b);
			if(b%5==0) {
				b/=5;
			}
		}
		answer = a%b==0 ? 1 : 2; // 기약분수
        return answer;
    }
}
