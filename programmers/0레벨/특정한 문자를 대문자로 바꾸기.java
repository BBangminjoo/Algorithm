class Solution {
    public String solution(String my_string, String alp) {
		String answer = "";
		String result = "";
			if(my_string.contains(alp)) {
				answer = alp.toUpperCase();
				result = my_string.replace(alp, answer);
			}else {
				result = my_string;
			}
        return result;
    }
}
