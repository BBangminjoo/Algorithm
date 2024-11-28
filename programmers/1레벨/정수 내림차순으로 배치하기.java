import java.util.*;

class Solution {
    public long solution(long n) {
		// 정수 내림차순으로 배치하기
		// n의 각 자릿수를 큰것부터 작은순으로 정렬한 새로운 정수 리턴
		// ex) n = 118372 -> 873211
      long answer = 0; 
		
		String nn = String.valueOf(n);
		String str = nn.trim();
		List<Integer> list = new ArrayList();
		for(int i=0;i<str.length();i++) {
			list.add((int)str.charAt(i)-48);
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		// list를 String형으로 변환하기
		String[] stringArray = new String[list.size()];
		for(int i=0; i<list.size();i++) {
			stringArray[i] = Integer.toString(list.get(i));
		}
		String result = "";
		for(int i=0; i<stringArray.length; i++) {
			result += stringArray[i];
		}
		answer = Long.parseLong(result);
        return answer;
    }
}
