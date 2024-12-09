
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
		int[] answer = {};
		// 제일 작은 수 제거하기
		/*
		 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
		 * 
		 * 해결방법 1)가장 작은 숫자 추출 2)가장 작은 숫자를 제외한 ArrayList 생성 3)ArrayList 를 배열로 변환
		 */
		if (arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			int min = arr[0];
			for (int num : arr) {
				if (num < min) {
					min = num;
				}
			}

			List<Integer> list = new ArrayList();
			for (int num : arr) {
				if (num != min) {
					list.add(num);
				}
			}
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
        return answer;
    }
}
