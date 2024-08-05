class Solution {
    public int solution(int n) {
        int answer = 0;
		int factorial = 1;
        
        for(int i=1; i<=10; i++){ //n의 범위값 최대 팩토리얼은 10
            factorial *= i; // 곱셈할 때 기본값 1이어야함
            
            if(factorial == n){  //n이랑  같으면
                answer = i; // i를 넣어주면 됨 
                break;
            }else if(n < factorial){ // n보다 클 경우
                answer = (i-1); // i에 1뺀 값 출력하기
                break;
            }
        }        
        return answer;
    }
}
