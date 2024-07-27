class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n]; // 크기가 n*n인 이차원 배열 생성
		
		for(int i=0; i<n; i++) { // 이차원 배열 초기화 위한 반복문
			for(int j=0; j<n; j++) {
				if(i==j) { // 동일하면
					answer[i][j]=1; //1담기
				}else {
					answer[i][j]=0; //0담기
				}
			}
		}
        return answer;
    }
}
