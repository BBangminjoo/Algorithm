import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		double[] arr = new double[numlist.length]; 
		for(int i=0;i<numlist.length;i++) {
			if(numlist[i]-n<0) { //음수일경우
				arr[i]= ((int)Math.abs(numlist[i]-n)) + 0.5;
			}else { // 양수일경우
				arr[i]= numlist[i]-n;
			}
		}
		Arrays.sort(arr);
		
		for(int j=0;j<numlist.length;j++) {
			if(arr[j]%1!=0) {
				answer[j] = n -(int)arr[j];
			}else {
				answer[j] = (int)arr[j] +n;
			}
		}
        return answer;
    }
}
