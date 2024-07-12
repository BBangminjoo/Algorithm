import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
		List list = new ArrayList();
		List list2 = new ArrayList();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) {
				list.add(i);
			}
		}
		if(list.size()==0) {
			answer= new int[1];
			answer[0]=-1;
		}else {
			// list에 담은 2의 위치 찾기
			for(int j=(int)list.get(0); j<=(int)list.get(list.size()-1); j++) {
				list2.add(arr[j]);
			}
			System.out.println(list2.toString());
			answer = new int[list2.size()];
			
			for(int k=0; k<answer.length; k++) {
				answer[k] = (int)list2.get(k);
			}
		}
		
        return answer;
    }
}
