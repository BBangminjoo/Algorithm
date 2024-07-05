import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
		// 모든 수를 기록한 수열이 저장될 list 
		List<Integer> list = new ArrayList<Integer>();


		list.add(n); // 첫 n의 값도 list에 넣어 저장
		
		// 1에 도달하면 while문 밖으로 빠져나감
		while(n!=1) {
			if(n%2==0){ // n이 짝수일때
				n /=2;
				list.add(n); // list에 넣어 저장
			}else { // n이 홀수일때
				n = n * 3 + 1; 
				list.add(n); // list에 넣어 저장
			}

		}
        int index = 0;
        // list의 길이만큼 answer방 만들기
        answer = new int[list.size()] ;
        // 방법1) 향상된 포문으로 구하는 방법
		for(int a : list) {
			answer[index] = a;
			index++;
		}        
        
        // 방법2) 포문으로 구하는 방법
        // answer에 list 넣어주기 
        // for(int i = 0; i<answer.length; i++){
        //     answer[i] = list.get(i);
        // }
        
        return answer;
    }
}
