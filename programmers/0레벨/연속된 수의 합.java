class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num]; // num의 길이만큼의 answer배열 길이 설정
        int start = (total/num) - ((num - 1)/2); // 처음 시작하는 값
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        return answer;
    }
}
