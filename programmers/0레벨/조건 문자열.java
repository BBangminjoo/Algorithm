class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        // ineq가 >일때 
		if(ineq.equals(">")) {
                        // eq가 =일때
			if(eq.equals("=")) {
                             // n <= m 이 성립하면 1 , 아니면 0
			    answer = n >= m ? 1 : 0;
                        // eq가 !일때
			}else if(eq.equals("!")) {
				 answer = n > m ? 1 : 0;
			}
                 // ineq가 <일때     
		}else if(ineq.equals("<")) {
			if(eq.equals("=")) {
				 answer = n <= m ? 1 : 0;
			}else if(eq.equals("!")) {
				 answer = n < m ? 1 : 0 ;
			}
		}           
        return answer;
    }
}
