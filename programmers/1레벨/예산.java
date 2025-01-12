//예산 Summer/Winter Coding(~2018)
/*
부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
최대 몇 개의 부서에 물품을 지원할 수 있는지 return */
import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
		int answer = 0;
		int cnt = 0;
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			if(budget>=d[i]) {
				budget -= d[i];
				cnt++;
			}else {
				break;
			}
		}
        return cnt;
    }
}
