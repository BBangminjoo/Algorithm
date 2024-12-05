// 음양더하기
/*
정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 
이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
실제 정수들의 합을 구하여 리턴하세요.
*/ 

import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0 ;
		List<Integer> list = new ArrayList();
		for(int i=0;i<absolutes.length;i++) {
			if(signs[i]==true) {
				list.add(absolutes[i]);
			}else {
				list.add(-(absolutes[i]));
			}
		}
		for(int i=0;i<list.size();i++) {
			answer += list.get(i);
		}
        return answer;
    }
}
