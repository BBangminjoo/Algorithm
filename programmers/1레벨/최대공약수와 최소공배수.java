//최대공약수와 최소공배수
/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환
*/
import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
		// [1] 최대공약수 구하기 
		// 1. 약수구하기
		List<Integer> list = new ArrayList();
		for(int i=1;i<=n;i++) { // n의 약수
			if(n%i==0) {
				list.add(i);
			}
		}
		List list2 = new ArrayList();
		for(int i=1;i<=m;i++) { // m의 약수
			if(m%i==0) {
				list2.add(i);
			}
		}
		// 2. n과 m의 공약수
		list.retainAll(list2); // 비교해서 중복값 찾기
		
		// 3. n과 m의 ***최대공약수*** = max 구하기
		int max = Collections.max(list); 
	
		//-----------------------------------------
		
		// [2] 최소공배수 구하기
		int min = (n*m)/max;
		
		List<Integer> list3 = new ArrayList();
		list3.add(max); 
		list3.add(min);
		
		int[] answer =  new int[list3.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i] = (int) list3.get(i);
		}
        return answer;
    }
}
