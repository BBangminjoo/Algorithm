class Solution {
    public int solution(int[][] dots) {
        int answer = 0; // 넓이를 저장할 변수 
        // x축과 y축의 최소값과 최대값을 저장하는 변수 
        // 초기화 (초기값을 첫번째 점의 좌표로 설정)
        int minX = dots[0][0]; 
        int minY = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]); // 두 값 중 더 작은 값 반환하여 minx와 miny을 업뎃
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]); // 두 값 중 더 큰 값 반환
            maxY = Math.max(maxY, dots[i][1]);
        }
        
        answer = (maxX - minX) * (maxY - minY); // 직사각형 넓이 : 가로 * 세로 
        										// 가로 = 가장 큰 x값 - 가장 작은 x값
        										// 세로 = 가장 큰 y값 - 가장 작은 y값
        return answer;
    }
}
