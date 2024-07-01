class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
    	for(int i = 0; i < queries.length; i++) {
    		int[] query = queries[i];
    		int currentNum = 1000001;		
    		for(int j = query[0]; j <= query[1]; j++) {
    			if(arr[j] > query[2] && arr[j] < currentNum) currentNum = arr[j];
    		}
    		answer[i] = (currentNum == 1000001) ?  -1 : currentNum;
    	}
    	return answer;
    }
}
