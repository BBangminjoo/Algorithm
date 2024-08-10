import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
		/* 1. 잘라서 저장할 배열의 길이 구하기 */
		int length =0; // my_str을 n만큼 잘라서 배열에 담을 때 필요한 배열 길이 
		if(my_str.length()%n==0) {// n으로 나눴을 때 나머지가 0이면 
			length = my_str.length()/n; // 문자열 길이를 n으로 나눈 값이 배열의 길이가 됨
		}else {
			length = my_str.length()/n+1; // 0이 아니면 나누어떨어지지 않는 거니까 배열 방이 하나 더 생길 거다
										  // 그래서  n+1
		}
		/* 2. 문자열 n만큼 잘라서 배열에 저장하기 */
		answer = new String[length];
		for(int i=0;i<answer.length;i++) {
			if(my_str.length() >= n) { // 문자열 길이가 n보다 크거나 같으면 
				answer[i] = my_str.substring(0,n); // 0부터 n까지 잘라서 담고
				my_str = my_str.substring(n, my_str.length()); // 다시 n부터 문자열 길이까지 초기화
			}else { //문자열 길이가 n보다 작으면 
				answer[i] = my_str.substring(0, my_str.length()); //0번째부터 문자열 길이끝까지 담기
			}
		}        
        return answer;
    }
}
