// 수박수박수박수박수박수?
/* 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴
예를 들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴*/
class Solution {
    public String solution(int n) {
        String answer = "";
		StringBuilder s = new StringBuilder();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				s.append("수");
			}else {
				s.append("박");
			}
		}        
        return s.toString();
    }
}
