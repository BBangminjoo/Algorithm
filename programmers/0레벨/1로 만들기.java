class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				if (num_list[i] % 2 == 0) { // 짝수라면
					num_list[i] /= 2;
				} else { // 홀수라면
					num_list[i] -= 1; 
					num_list[i] /= 2;
				}
				answer++;
			}

		}
        return answer;
    }
}
