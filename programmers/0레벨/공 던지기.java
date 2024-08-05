class Solution {
    public int solution(int[] numbers, int k) {
		int answer = 0;
		int index = 0;

		for (int i = 1; i < k; i++) { // k번째로 공을 던지는 사람을 구하는 반복문
			index += 2; // 오른쪽으로 한명을 건너뛰니까 2씩 더하기
		}
		index %= numbers.length; // index가 배열의 길이보다 커질 수 있으니까 나눠주기
		answer = numbers[index]; // 구한 index값을 index로 가지는 배열 값  
        return answer;
    }
}
