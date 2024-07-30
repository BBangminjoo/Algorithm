import java.util.*;
class Solution {
    public int solution(int[] numbers) {
		Arrays.sort(numbers); // 배열 오름차순 정렬
		
		int len = numbers.length; // 배열의 길이를 구하기
		int answer = numbers[0] * numbers[1]; // 가장 작은 두 수 곱셈 
		
		int answer1 = numbers[len-1] * numbers[len-2]; // 가장 큰 두 수 곱셈
		
		if (answer > answer1) {
            return answer;
		}
        
        return answer1;
    }
}
