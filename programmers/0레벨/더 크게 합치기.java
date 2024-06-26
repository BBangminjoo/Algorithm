class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		
      // 정수를 문자열로 바꾸기
		  String c = Integer.toString(a);
		  String d = Integer.toString(b);
		
		  // 문자열로 바꾼 값들을 더하여 변수에 저장하기 
		  // a+b랑 b+a를 비교해야 하니까 각각 변수에 저장
		  String e = c + d;
		  String f = d + c; 
		
		  // 문자열을 다시 정수형으로 바꾸기
		  int g = Integer.parseInt(e);
		  int h = Integer.parseInt(f);
		
		  // 정수 g랑 h의 값을 비교해서 
      // 둘 중 더 큰 값을 출력하기
		  if(g>h) {
			  answer=g;
		  }else {
			  answer=h;
		  }        
          return answer;
    }
}
