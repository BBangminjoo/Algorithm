class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
        	//indexOf() 메소드는 특정 문자열의 위치를 찾고자 할 때 사용하는데, 
        	// 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스 반환
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
            
        }        
        return answer;
    }
}
