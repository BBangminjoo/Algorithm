//부족한 금액 계산하기

/* 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다
* 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상
* 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return
* 단, 금액이 부족하지 않으면 0을 return*/

// 1. for문 사용
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
		long sum =0;
		
		
		for(int i=0;i<=count;i++) {
			sum = sum + (price * i);
		}
		if(money <sum) {
			answer = sum - money;
		}else {
			answer = 0;
		}
        return answer;
    }
}

// 2. while문 사용
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
		long sum =0;
		long cnt = 0;
		
		while(cnt<=count) {
			sum += price*cnt;
			cnt++;
		}
		if(money<sum) {
			answer = sum - money;
		}else {
			answer = 0;
		}
        return answer;
    }
}
