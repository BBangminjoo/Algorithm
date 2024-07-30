class Solution {
    public int solution(int[] array) {
		int[] answer = new int[1000];
		int max = Integer.MIN_VALUE; // 최대값저장, 최소값으로 초기값 설정 
		int mode = 0; 
		
		for(int i=0; i<array.length;i++) {
			answer[array[i]]++;
		}
		for(int i=0; i<answer.length;i++) {
			if(max<answer[i]) {
				max = answer[i]; // 최대값
				mode = i; 
			}else if(max == answer[i]) {
				mode = -1;
			}
		}
        return mode;
    }
}
