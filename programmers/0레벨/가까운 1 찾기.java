class Solution {
    public int solution(int[] arr, int idx) {
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i>=idx) {
				if(arr[i]==1) {
					answer = i;
                    
                    break; // 값을 찾았을 때 그 다음 배열을 찾지 못하도록 for문 멈추기 (가장 작은 인덱스 찾기)
				}
			}else {
				answer = -1;
			}
			
		}
        return answer;
    }
}
