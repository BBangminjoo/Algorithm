class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
		int num1 = 0;
		int num2 = 1;
		
		for(int i=0; i<num_list.length; i++) {
			// 배열 한개씩 잘라서 더하고 곱하기
			num1 += num_list[i]; // 모든 원소들의 합
			num2 *= num_list[i]; // 모든 원소들의 곱
		}
			// 모든 원소들의 합의 제곱
			int num3 = num1*num1;
		
			if(num2 > num3) {
				answer = 0;
			}else if(num2 < num3){
				answer = 1;
			}        
        return answer;
    }
}
