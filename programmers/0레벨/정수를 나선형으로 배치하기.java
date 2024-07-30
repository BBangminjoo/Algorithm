class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		// 변수 선언
		int cnt = 1 ; 
		int direction = 0 ; 
		int row = 0 ; 
		int col = 0 ; 
		
		while(cnt<=n*n){
			answer[row][col] = cnt++; 
			
			if(direction==0) {
				if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
			}else if(direction==1) {
				if (row == n - 1 || answer[row+1][col] != 0) {
					direction = 2;
					col--;
				}else {
					row++;
				}
			}else if(direction==2) {
				if(col==0 || answer[row][col-1] != 0) {
					direction = 3;
					row--;
				}else {
					col--;
				}
			}else if(direction==3) {
				if(row==0 || answer[row-1][col] != 0) {
					direction = 0;
					col++;
				}else {
					row--;
				}
			}
		}
        return answer;
    }
}
