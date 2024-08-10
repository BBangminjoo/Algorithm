class Solution {
    public int solution(int[] sides) {
방법1)	
	    int answer = 0;
		int max = Math.max(sides[0], sides[1]); // 0번째랑 1번째 배열 값중 최대값 찾기
		int min = Math.min(sides[0], sides[1]); // 최소값
		
		int low = max - min; 
		int high = max + min; 
        
        answer = high-low-1;
        return answer;
    }
}

------------------------------------------------------
방법2)	
	int answer = 0;
		int num = sides[0] + sides[1]; // 나머지 한 변을 지칭하는 변수
		int max = Math.max(sides[0], sides[1]); // 0번째랑 1번째 배열 값중 최대값 찾기
		int min = Math.min(sides[0], sides[1]); // 최소값

		/* 1. 나머지 한 변이 주어진 배열 안에 있는 경우 */
		for (int j = max-min+1; j <= max; j++) { // 최소값 다음부터 최대값(포함)까지
				answer ++;				
		}
		/* 2. 나머지 한 변이 배열에 없는 경우 */
		for (int k = max + 1; k < num; k++) {// 최대값부터 최대값+최솟값(미포함)까지
			answer ++;
		}
