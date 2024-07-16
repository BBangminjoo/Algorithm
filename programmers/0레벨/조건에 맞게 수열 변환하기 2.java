import java.util.*;

class Solution {
    public int solution(int[] arr) {
		int[] answer = {};
		List list = new ArrayList();
		int count = 0;
		while (true) {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) { // 50보다 크거나 같은 짝수라면
					arr[i] = arr[i] / 2;
					list.add(arr[i] / 2);
				} else if (arr[i] < 50 && arr[i] % 2 != 0) { // 50보다 작은 홀수라면
					arr[i] = arr[i] * 2 + 1;
					list.add(arr[i] * 2 + 1);
				} else {
					arr[i] = arr[i];
					list.add(arr[i]);
				}
			}
			count++;
			if (Arrays.toString(arr).equals(list.toString())) {
				break;
			} else {
				list.clear();
			}
		}
        return count-1;
    }
}
