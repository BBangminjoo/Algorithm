//같은 숫자는 싫어
/*
배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를 들면, arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
*/

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
		List<Integer> list = new ArrayList();
		list.add(arr[0]); // 첫번째값은 무조건 포함하게
		for(int i=1;i<arr.length;i++) {// 현재값이 이전 값과 다를경우
			if(arr[i]!=arr[i-1]) {
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()]; //리스트를 배열로 변환해서 출력하기
		for(int i=0;i<answer.length;i++) {
			answer[i] += list.get(i);
		}
        return answer;
    }
}
