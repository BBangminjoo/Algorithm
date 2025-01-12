// 3진법 뒤집기
/* 월간 코드 챌린지 시즌1
   자연수 n이 매개변수로 주어집니다.
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return*/

class Solution {
    public int solution(int n) {
		String answer = "";
		
		// 1. n을 3진법으로 만들기
		String samjinbub = Integer.toString(n, 3); // toString을 이용해서 10->3진법 변환 가능
		
		// 2. 3진법을 앞뒤 반전시키기
		for(int i=samjinbub.length()-1; i>=0; i--) {
			answer += samjinbub.charAt(i);
		}
		
		// 3. 3진법을 다시 10진법으로 표현하기 
        return Integer.parseInt(answer,3);// parseInt 이용해서 3->10진법 변환 가능
    }
}
