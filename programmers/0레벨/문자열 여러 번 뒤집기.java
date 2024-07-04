import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
		String[] str = my_string.split("");
		int s = 0;
		int e = 0;
		String temp2 ="";
		
		for(int i=0; i<queries.length; i++) {
			int temp = queries[i][1];
			for(int j=queries[i][0]; j<=queries[i][1]; j++) {
				
				if(temp-j==1) { //queries[i][0] - queries[0][1]이 1일떄
					temp2 = str[temp]; 
					str[temp]=str[j];
					str[j]=temp2;
				}else { // queries[i][0] - queries[0][1]이 1이 아닐때
					if(j!=temp) { // queries[i][0]이 queries[i][1]과 같지 않으면  
						temp2 = str[temp]; 
						str[temp]=str[j];
						str[j]=temp2;
						temp--;
					}else {
						break;
					}
				}
			}
			
		}
		for(int i=0; i<str.length; i++) {
			answer += str[i];
		}        
        
        return answer;
    }
}
