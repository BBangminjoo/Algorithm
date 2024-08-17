class Solution {
    public String solution(String polynomial) {
		String answer = "";
		int x = 0; // ~x값
		int n = 0; // 정수

		String[] str = polynomial.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("x")) {// x를 포함할 경우
				x += str[i].equals("x") ? 1 : Integer.parseInt(str[i].replace("x", ""));
			} else if (!str[i].equals("+")) { // +와 같지 않다면
				n += Integer.parseInt(str[i]);
			}
		}

		if (x == 1 && n == 0) { // x가 1이고 n이 0이면
			answer = "x";
		} else if (x == 1 && n != 0) { // x가 1이고 n이 0이 아니면
			answer = "x + " + n;
		} else if (x != 0 && n == 0) { // x가 0이고 n이 0이면
			answer = x + "x";
		} else if (x != 0 && n != 0) { // x가 0이 아니고 n이 0이 아니면
			answer = x + "x + " + n;
		} else if (x == 0 && n != 0) { // x가 0이고 n이 0이 아니면
			answer = Integer.toString(n); // 정수를 문자열로 변경
		}
        return answer;
    }
}
