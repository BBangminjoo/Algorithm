import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //배열array를 문자열arr에 담기 
		String arr = Arrays.toString(array);
		
        //문자열 중에 7이 있으면 증가시키기
		for(int i=0; i<arr.length();i++) {
			if(arr.charAt(i)=='7') {
				answer ++;
			}
		}        
        return answer;
    }
}
