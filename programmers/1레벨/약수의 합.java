class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //약수에는 1이 포함되니까 i는 1로 시작
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer + n;
    }
}
