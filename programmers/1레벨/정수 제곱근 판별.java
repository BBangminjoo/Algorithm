// 정수 제곱근 판별
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
// n이 양의정수 x의 제곱이라면 x+1의 제곱을 리턴
// n이 양의정수 x의 제곱이 아니라면 -1 리턴
class Solution {
    public long solution(long n) {
		long answer = 0; 
		for(long i=0;i*i<=n;i++) {
				if(i*i==n) {
					answer = (i+1)*(i+1);
				}else 
					answer = -1;
				}
        return answer;
    }
}
