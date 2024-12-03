// 서울에서 김서방찾기
// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없음
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
		for(int i=0; i<seoul.length;i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 "+i+"에 있다";
			}
		}        
        return answer;
    }
}
