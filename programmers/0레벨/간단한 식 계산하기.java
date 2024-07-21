class Solution {
    public int solution(String binomial) {
		String[] arr = binomial.split(" ");
		int answer = 0;
		
		if(arr[1].equals("+")) {
			answer = Integer.valueOf(arr[0])+Integer.valueOf(arr[2]);
		}else if(arr[1].equals("-")) {
			answer = Integer.valueOf(arr[0])-Integer.valueOf(arr[2]);
		}else if(arr[1].equals("*")) {
			answer = Integer.valueOf(arr[0])*Integer.valueOf(arr[2]);
		}
        return answer;
    }
}
