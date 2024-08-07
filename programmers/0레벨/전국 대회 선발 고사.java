import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int arr[] = new int[rank.length];
        
        // sort 배열 생성
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				arr[i] = rank[i];
			} else {
				rank[i] = Integer.MAX_VALUE;//정수의 최대값
			}
		}
        
        // 오름차순 정렬
		Arrays.sort(rank);

		// 10000 × a + 100 × b + c 계산
		for (int i = 0; i < arr.length; i++) {
			if (rank[0] == arr[i]) {
				answer += i * 10000;
			} else if (rank[1] == arr[i]) {
				answer += i*100;
			} else if (rank[2] == arr[i]) {
				answer += i;
			}
		}
        return answer;
    }
}
