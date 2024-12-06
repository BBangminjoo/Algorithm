class Solution {
    public int solution(int[] numbers) {
		// 없는 숫자 더하기
		/*
		0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
		numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 
		*/ 
	
		int total = 45; // 0부터 9까지의 합
		
		int numTotal = 0; 
		for(int num : numbers) { // numbers 의 합 
			numTotal += num;
		}
		
		int answer = total - numTotal; // total에서 numbers 빼기
        return answer;
    }
}
