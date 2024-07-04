class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    // 2차원 배열의 세로 길이 
		for(int i=0; i<queries.length; i++) {
			// 2차원 배열의 가로 길이 중에서 0번째 방부터 1번째 방까지
      for(int j=queries[i][0]; j<=queries[i][1]; j++) {
				// (k는 2번째 방에 있다) j가 k의 배수이면
        if(j % queries[i][2]==0) {
					// arr[i]에 1 더하기
          arr[j] += 1;
				
			}
				
		}
		
	}        
        return arr;
    }
}
