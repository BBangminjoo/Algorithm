class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries의 길이만큼 answer의 방을 만들어주기
        int[] answer = new int[queries.length];
        
        // i=0부터 queries의 길이까지  
    	for(int i = 0; i < queries.length; i++) {
            // queries의 원소는 각각 하나의 query를 나타낸다. 
    		int[] query = queries[i];
            
    		int currentNum = 1000001;	
            
            
    		for(int j = query[0]; j <= query[1]; j++) {
    		    
                if(arr[j] > query[2] && arr[j] < currentNum) {
                    
                    currentNum = arr[j];
                }
                    
    		}
    		answer[i] = (currentNum == 1000001) ?  -1 : currentNum;
    	}
    	return answer;
    }
}
