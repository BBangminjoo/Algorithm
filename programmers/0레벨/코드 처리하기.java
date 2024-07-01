class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i=0;i<code.length();i++){
        	// mode = 0 일때
        	if(mode==0){
        	   // code문자열에서 1이 아닌 것 중에 	
               if(code.charAt(i)!='1'){
            	   // i가 짝수일때
                    if(i%2==0){
                    	// code의 문자를 하나씩 더하기
                        answer+=code.charAt(i);
                    }
                 // code문자열에서 1이면   
                }else if(code.charAt(i)=='1'){
                    // mode는 1로 바꾸기
                	mode=1;
                } 
            //mode가 0이 아닌 것 중에 (1인 것 중에)    
            }else{
            	// code의 문자열에서 1이 아닌 것 중에 
                if(code.charAt(i)!='1'){
                	// i가 짝수가 아닐때(홀수)
                    if(i%2==1){
                    	//code의 문자를 하나씩 더하기
                        answer+=code.charAt(i);
                    }
                // code의 문자열에서 1이면
                }else if(code.charAt(i)=='1'){
                    // mode를 0으로 바꾸기
                	mode=0;
                }
            }

        }
        // answer이 빈 문자열이라면 EMPTY를 출력
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}
