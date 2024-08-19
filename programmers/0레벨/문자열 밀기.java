import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
		if (A.equals(B)) {
			answer = 0;
		} else {
			while (true) {
				List list = new ArrayList();
				for (int i = 0; i < A.length() - 1; i++) {
					list.add(A.charAt(i));
				}
				list.add(0, A.charAt(A.length() - 1));

				A = "";
				for (int k = 0; k < list.size(); k++) {
					A += list.get(k);
				}

				if (A.equals(B)) {
					answer++;
					break;
				} else if (A.length() < answer) {
					answer = -1;
					break;
				}
				answer++;
			}
		}      
        return answer;
    }
}
