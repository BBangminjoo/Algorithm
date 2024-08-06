class Solution {
    public int solution(String s) {
        int answer = 0;

		// 숫자와 "Z"가 공백으로 구분되어 담긴 문자열
		// 문자열에 있는 숫자를 차례대로 더하기
		// "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻
		
		// s 문자열을 공백을 기준으로 잘라서 배열에 넣기
		String[] arr = s.split(" "); // 문자열 사이 공백으로 잘라짐

		// 공백으로 잘라진 s 문자열 arr 포문 
		for(int i=0; i<arr.length; i++) { 
			if(arr[i].equals("Z")) { // 값이 Z일 경우 
				answer -= Integer.parseInt(arr[i-1]); // Z가 나오기 전 값을 빼기 
			}else {
				answer += Integer.parseInt(arr[i]); // answer 에 i값 더하기
			}
		}        
        
        return answer;
    }
}
