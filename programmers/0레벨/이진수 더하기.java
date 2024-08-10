class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
		/* Integer 클래스의 toBinaryString 함수를 사용하여 진수 변환하기
		1) 10진수를 2진수로 변환할 때 
		Integer.toBinaryString(int i);
		
		2) 2진수를 10진수로 변환하기 위해서는
		Integer.parseInt(String s, int n진수);
		*/
		answer = Integer.toBinaryString(
				(Integer.parseInt(bin1,2)) + (Integer.parseInt(bin2,2)));
        return answer;
    }
}
