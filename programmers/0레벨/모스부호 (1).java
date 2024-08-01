class Solution {
    public String solution(String letter) {
		String[] arr = letter.split(" ");
		String answer = "";
		
		String[] str = {".-","-...","-.-.","-..",".","..-.","--.",
						"....","..",".---","-.-",".-..","--","-.",
						"---",".--.","--.-",".-.","...","-","..-",
						"...-",".--","-..-","-.--","--.."};
	
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j < str.length; j++) {
				if(arr[i].equals(str[j])) {
					answer += (char)(j+97);
				}
			}
		}
        return answer;
    }
}
