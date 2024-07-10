import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
		String[] answer = my_string.split(""); // split : ""을 기준으로 문자열을 나누어 배열 만들어줌
		for(int i=0; i<indices.length; i++) {
			answer[indices[i]] = "";
		}
		String result = "";

		for(int i=0;i<answer.length;i++) {
			result+=answer[i];
		}        
        return result;
    }
}
