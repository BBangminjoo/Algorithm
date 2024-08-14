import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		List<Double> list = new ArrayList();
		
		for(int i=0;i<score.length;i++) {
				list.add((score[i][0] + score[i][1]) /2.0);
		}
		Arrays.fill(answer, 1); // 배열 초기화
		for(int j=0;j<list.size();j++) {
			for(int k=0;k<list.size();k++) {
				if(list.get(j)>list.get(k)) {
					answer[k] += 1;
				}
			}
		}
        return answer;
    }
}
