class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String start = my_string.substring(0, s);
        String end = my_string.substring(e+1);
        String a = "";
        
        for(int i=e; i>=s; i--) {
        	a += String.valueOf(my_string.charAt(i));
        }
        answer = start+a+end;
        return answer;
    }
}
