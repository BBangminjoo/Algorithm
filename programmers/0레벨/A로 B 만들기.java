import java.util.*;

class Solution {
    public int solution(String before, String after) {
		int answer = 0; 
		
		// 배열에 넣어주기
        char[] arr1 = before.toCharArray(); 
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1); // 사전식 정렬
        Arrays.sort(arr2);
        
        String str1 = new String(arr1);
        String str2 = new String(arr2);
        
        answer = str1.equals(str2) ? 1 : 0;
       
//        if(str1.equals(str2)) {
//        	answer = 1;
//        }else {
//        	answer = 0;
//        }  
        return answer;
    }
}
