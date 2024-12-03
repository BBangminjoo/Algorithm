// 나누어 떨어지는 숫자 배열
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}
		}
		if(list.size()==0) {
			list.add(-1);
		}
	    Collections.sort(list);
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i] += list.get(i);
		}
        return answer;
    }
}
