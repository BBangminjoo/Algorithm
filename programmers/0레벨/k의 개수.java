class Solution {
    public int solution(int i, int j, int k) {
		int answer = 0;
		String str = "";
		for(int a=i; a<=j; a++) {
			str += Integer.toString(a); // i-j까지 문자열로 변환
		}
		String[] strArr = str.split(""); // 변환한것을 배열로 생성
		for(int b=0; b<strArr.length; b++) {
			if(strArr[b].contains(Integer.toString(k))) { // k를 포함하는경우
				answer ++;
			}
		}
		
        return answer;
    }
}
