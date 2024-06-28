class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int temp = 0;
		// 포문으로 배열의 길이를 구하기
			for(int j=0; j<queries.length; j++) {
				for(int k=0; k<queries[j].length-1; k++) {
					// 배열 i,j 자리 바꾸기
					temp = arr[queries[j][k]];
					arr[queries[j][k]] = arr[queries[j][k+1]];
					arr[queries[j][k+1]] = temp;
					
				}
				
			}
			for(int i=0; i<arr.length; i++) {
				answer[i] = arr[i];
			}        
        return answer;
    }
}
