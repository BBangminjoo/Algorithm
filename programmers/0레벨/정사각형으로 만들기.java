class Solution {
    public int[][] solution(int[][] arr) {
		int maxNum = Math.max(arr.length, arr[0].length); // Math.max : 최댓값 구하는 함수
		int[][] answer = new int[maxNum][maxNum];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}
        return answer;
    }
}
