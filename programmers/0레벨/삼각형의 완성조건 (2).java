class Solution {
    public int solution(int[] sides) {
        int answer = 0;
		int max = Math.max(sides[0], sides[1]); // 0번째랑 1번째 배열 값중 최대값 찾기
		int min = Math.min(sides[0], sides[1]); // 최소값
		
		int low = max - min; 
		int high = max + min; 
        
        answer = high-low-1;
        return answer;
    }
}
