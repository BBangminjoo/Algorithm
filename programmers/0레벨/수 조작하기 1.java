class Solution {
    public int solution(int n, String control) { 
		
		for(int i=0; i<control.length(); i++) {
			char a = control.charAt(i);
			
			if(a=='w') {
				n += 1;
			}else if(a=='s') {
				n += -1;
			}else if(a=='d') {
				n += 10;
			}else if(a=='a') {
				n += -10;
			}
		}
        return n;
    }
}
