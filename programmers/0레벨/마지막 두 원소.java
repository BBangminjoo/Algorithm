class Solution {
    public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];
		
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
			// 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값 추가
			if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
				answer[num_list.length] 
                        = num_list[num_list.length - 1] - num_list[num_list.length - 2];
			// 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가
			} else {
				answer[num_list.length] = num_list[num_list.length - 1] * 2;
			}
		}
        return answer;
    }
}
