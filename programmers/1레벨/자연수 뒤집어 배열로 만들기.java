import java.util.*;
class Solution {
    public int[] solution(long n) {
		// 자연수 뒤집어 배열로 만들기
		// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
		// ex) n = 12345 -> [5,4,3,2,1]
		String nn = String.valueOf(n);
		String str = nn.trim();
		System.out.println(str);
		
		List<Integer> list = new ArrayList();
		for(int i=0;i<str.length();i++) {
			list.add((int) str.charAt(i)-48);
		}
		Collections.reverse(list);
		
		int[] answer = new int[list.size()]; 
		for(int i=0; i<list.size(); i++) {
			answer[i] += list.get(i);
		}
        return answer;
    }
}
