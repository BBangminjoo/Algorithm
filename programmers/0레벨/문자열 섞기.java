class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // for문으로 str1, str2을 한글자씩 뽑아서 번갈아 출력
        for(int i=0; i<str1.length(); i++) {
        	answer += (char)str1.charAt(i) 
                   +""+(char)str2.charAt(i);
        }
        return answer;
    }
}
