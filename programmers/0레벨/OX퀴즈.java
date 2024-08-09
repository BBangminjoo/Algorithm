import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
		List list = new ArrayList();
		for (int i = 0; i < quiz.length; i++) {

			String[] quizArr = quiz[i].split(" ");

			int num1 = Integer.parseInt(quizArr[0]);
			int num2 = Integer.parseInt(quizArr[2]);
			int result = Integer.parseInt(quizArr[4]);

			if (quizArr[1].equals("+")) {
				String aa = (num1 + num2 == result) ? "O" : "X";
				list.add(aa);
			} else if (quizArr[1].equals("-")) {
				String aa = (num1 - num2 == result) ? "O" : "X";
				list.add(aa);
			}
		}
		answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (String) list.get(i);
		}        
        return answer;
    }
}
