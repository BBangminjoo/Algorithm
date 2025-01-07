import java.util.*;
// 이상한 문자 만들기
/*1. 문자열 s는 한 개 이상의 단어로 구성
2. 각 단어는 하나 이상의 공백 문자로 구분
3. 각 단어의 짝수번째 알파벳은 대문자
4. 홀수번째 알파벳은 소문자로 바꾼 문자열 리턴*/
class Solution {
    public String solution(String s) {
		String[] ss = s.split(" ", -1);
		System.out.println(Arrays.toString(ss));
		
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<ss.length;i++) {
			StringBuilder sb2 = new StringBuilder();
			
			for(int j=0; j<ss[i].length();j++) {
				if(j%2==0) {
					sb2.append(Character.toUpperCase(ss[i].charAt(j)));
				}else {
					sb2.append(Character.toLowerCase(ss[i].charAt(j)));
				}
			}
			sb1.append(sb2);
			if(i<ss.length -1) {
				sb1.append(" ");
			}
		}
        return sb1.toString();
    }
}
