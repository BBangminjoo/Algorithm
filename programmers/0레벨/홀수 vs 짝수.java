class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		int answer2= 0;
		int result = 0;
		for(int i=0; i<num_list.length; i++) {
			// 짝수일때
			if(i%2==0) {
				answer += num_list[i];
			}else {
				answer2 += num_list[i];
			}
		}
		if(answer > answer2) {
			result = answer;
		}else if(answer < answer2) {
			result = answer2;
		}else {
			result = answer;
		}
        return result;
    }
}
