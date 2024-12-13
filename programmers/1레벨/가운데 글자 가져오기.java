class Solution {
    public String solution(String s) {
        String answer = "";
		int center = s.length()/2;

		for(int i=0;i<s.length();i++) {
			if(s.length()%2!=0) {//홀수일경우
				answer = s.substring(center, center+1);
			}else { //짝수일경우
				answer = s.substring(center-1, center+1);
			}
		}        
        return answer;
    }
}
