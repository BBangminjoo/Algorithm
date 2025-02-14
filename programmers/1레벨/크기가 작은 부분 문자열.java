//크기가 작은 부분 문자열
/*
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return
*/
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
		for(int i=0;i<t.length()-p.length()+1;i++) {
			String temp = t.substring(i, i+p.length());//p길이씩 비교하기
			
			if(Long.parseLong(p)>=Long.parseLong(temp)) { //수비교
				answer++;
			}
		}        
        return answer;
    }
}
