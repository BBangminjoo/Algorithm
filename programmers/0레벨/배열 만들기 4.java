import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
		int i = 0; // 문제 조건) 변수 i 만들기

		List list = new ArrayList();
		while (true) {

			if (i < arr.length) { // i가 arr길이보다 작을경우
				if (list.isEmpty()) { // list가 비어있으면
					list.add(arr[i]); // list에 arr[i]추가하기
					i += 1; // i에 +1도 하기
				} else if (!list.isEmpty()) { // list가 비어있지 않을경우
					if ((int) list.get(list.size() - 1) < arr[i]) { // list의 마지막 값이 arr[i]값보다 작을경우
						list.add(arr[i]); // stk뒤에 추가하라고 했는데 이 말은 list에 arr[i]추가하는 것과 같음
						i += 1; // i에 +1도 하기
					} else if ((int) list.get(list.size() - 1) >= arr[i]) { // list의 마지막 값이 arr[i]값보다 크거나 같을경우
						list.remove(list.size() - 1); // stk의 마지막 원소를 stk에서 제거(list의 마지막 값 제거)
					}
				}
			}else {
				break;
			}
		}
		stk = new int[list.size()]; //stk의 방 list의 크기만큼 새로 만들어주기
		for (int j = 0; j < stk.length; j++) { 
			stk[j] = (int) list.get(j); // list의 값들을 skt방에 하나씩 가져와 담기
		}        
        return stk;
    }
}
