import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
		List list = new ArrayList();
		for(int i=0; i<query.length; i++) {
			// 짝수 인덱스
			if(i%2==0) {
				//query[i]인덱스 뒷부분 잘라서 버려
				for(int j=0; j<=query[i]; j++) {
					//arr에서 query[i]번 인덱스 제외
					list.add(arr[j]);
				}
			// 홀수 인덱스
			}else {
				//query[i]번 인덱스 앞부분 버려
				for(int k=query[i]; k<arr.length; k++) {
					//arr에서 query[i]번 인덱스 제외
					list.add(arr[k]);
				}
			}
			arr = new int[list.size()];
			for(int x=0;x<list.size();x++) {
				arr[x]=(int)list.get(x);
			}
			list.clear();        
       
        }
         return arr;
    }
}
