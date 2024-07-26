import java.math.*;

class Solution {
    public String solution(String a, String b) {
			BigInteger bigNumber1 = new BigInteger(a);
			BigInteger bigNumber2 = new BigInteger(b);
			BigInteger number = bigNumber1.add(bigNumber2);
			String answer = number.toString();
        return answer;
    }
}
