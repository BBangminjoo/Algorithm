import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		// 대소문자 바꿔서 출력하기
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";

		// 문자열 a의 각 자리가 홀수인지 짝수인지 구별한다.
		for (int i = 0; i < a.length(); i++) {
			// 문자열을 문자 한 자씩 분리한다.
			char b = a.charAt(i);

			// 문자 한 자가 소문자라면 대문자로 바꿔주고
			if (Character.isLowerCase(b) == true) {
				answer += Character.toUpperCase(b);
			} else {
				// 대문자라면 소문자로 바꿔서 합쳐서 출력해준다.
				answer += Character.toLowerCase(b);
			}
		}
		System.out.print(answer);
    }
}
