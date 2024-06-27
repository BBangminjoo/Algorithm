class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
		String num1 = "";
		String num2 = "";

		for (int i = 0; i < num_list.length; i++) {
			// 홀짝 구별하기
			if (num_list[i] % 2 == 0) {
				num1 += Integer.toString(num_list[i]); // 짝끼리 더해주기
			} else {
				num2 += Integer.toString(num_list[i]); // 홀끼리 더해주기
			}
		}
		// 다시 숫자(정수형)로 바꾸기
		int sum1 = Integer.parseInt(num1);
		int sum2 = Integer.parseInt(num2);

	    answer = sum1 + sum2;        

        return answer;
    }
}
