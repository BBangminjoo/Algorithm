class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
		String temp = myString.replace("A","Z").
						replace("B", "A").replace("Z", "B");
		System.out.println(temp);
		if(temp.contains(pat)) {
			answer = 1;
		}else {
			answer = 0;
		}        
        return answer;
    }
}
