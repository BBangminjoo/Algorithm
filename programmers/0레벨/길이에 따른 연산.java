class Solution {
    public int solution(int[] num_list) {
		int answer = 0; // 덧셈 결과 처리용
		int result = 1; // 곱셈 결과 처리용 
		for (int i = 0; i < num_list.length; i++) {
			if (num_list.length >= 11) {
				answer += num_list[i]; // 모든 원소의 합
			} else if (num_list.length <= 10) {
				result *= num_list[i]; // 모든 원소의 곱
				answer=result;
			}
		}      
        return answer;
    }
}
