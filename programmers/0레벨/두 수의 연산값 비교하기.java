class Solution {
    public int solution(int a, int b) {
		int answer=0;
		
		// 주어진 정수형 a, b를 문자열로 바꾸기 
		String c = Integer.toString(a);
		String d = Integer.toString(b);
		
		// 문자열로 바꾼 값들을 더해주기
		String e = c + d;
		
		// 2*a*b를 변수에 넣어주기
		int f =  2 * a * b;
		
		// 문자열로 바꿔서 더한 값을 다시 정수형으로 바꾸기
		int g = Integer.parseInt(e); 
		
		// 전자가 더 크면 g 출력 / 
        // 후자가 더 크면 f 출력 / 같으면 g 출력하기 
		if(g>f) {
			answer = g;
		}else if(g<f) {
			answer = f;
		}else if(g==f) {
			answer = g;
		}
        return answer;
    }
}
