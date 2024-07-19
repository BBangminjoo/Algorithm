class Solution {
    public String solution(String myString, String pat) {
		int n = myString.lastIndexOf(pat);
		String answer = myString.substring(0, n+pat.length());
        return answer;
    }
}
