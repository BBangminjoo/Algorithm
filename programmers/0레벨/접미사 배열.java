import java.util.*;

class Solution {
    public String[] solution(String my_string) {
		String[] answer = new String[my_string.length()]; // my_string의 길이만큼 answer의 방 만들기
		for(int i=0; i<my_string.length(); i++) {
			answer[i] = my_string.substring(i, my_string.length()); // for문 돌아가는 동안 i부터 my_string의 길이까지 잘라낸 것을 answer[i]에 담기 
		}
		Arrays.sort(answer);  // 사전적 순서로 정렬하기
        return answer;
    }
}
