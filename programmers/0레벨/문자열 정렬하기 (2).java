import java.util.*;
class Solution {
    public String solution(String my_string) {
		String str = my_string.toLowerCase();
		char[] charArr = str.toCharArray(); // String to Char Array
		Arrays.sort(charArr); // Char Array 알파벳 순 정렬
		// Char Array to String
		String answer = new String(charArr); // 또는 String.valueOf(charArr);          
        return answer;
    }
}
