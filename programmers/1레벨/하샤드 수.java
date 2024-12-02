// 하샤드수
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다.
// ex) 18의 자릿수 합은 1+8=9, 18은 나누어떨어지므로 18은 하샤드 수 
class Solution {
    public boolean solution(int x) {
		boolean answer = true;
		int hasade = 0;
		String str = String.valueOf(x);
		for(int i=0;i<str.length();i++) {
			hasade += str.charAt(i)-48;
		}
		if(x%hasade==0) {
			answer = true;
		}else {
			answer = false;
		}
        return answer;
    }
}
