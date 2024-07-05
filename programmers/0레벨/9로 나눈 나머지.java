class Solution {
    public int solution(String number) {
		int sum = 0;
		// 문자열을 문자로 하나씩 자르기 
		for(int i=0; i<number.length(); i++) {
			sum += Character.getNumericValue(number.charAt(i)); 
    // Character.getNumbericvValue(char ch)  : 주어진 문자 ch의 숫자 값을 반환	
		}
			int remainder = sum % 9;        
        return remainder;
    }
}
