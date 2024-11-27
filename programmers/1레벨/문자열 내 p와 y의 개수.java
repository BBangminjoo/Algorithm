// 문자열 내 p와 y의 개수
// 문자열 s에 p의 개수와 y의 개수를 비교해서
// 같으면 True 다르면 False
// p, y가 모두 하나도 없는 경우 항상 True
// 개수 비교 시 대소문자 구별 x

class Solution {
    boolean solution(String s) {
		boolean answer = true;
		int cnt = 0;
		int cnt2 = 0;
		String ss = s.toUpperCase();

		if (ss.contains("P") || ss.contains("Y")) {

			for (int i = 0; i < ss.length(); i++) {
				if (ss.charAt(i) == 'P') { // p를 포함하면
					cnt++;
				} else if (ss.charAt(i) == 'Y') { // Y를 포함하면
					cnt2++;
				}
			}
			if (cnt != cnt2) {
				answer = false;
			}
		}

		System.out.println("cnt : " + cnt);
		System.out.println("cnt2 : " + cnt2);
		System.out.println(answer);

        return answer;
    }
}
