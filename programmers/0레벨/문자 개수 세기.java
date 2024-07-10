		int[] answer = new int[52]; // 길이 52인 정수 배열 선언

	        for(int i = 0; i < my_string.length(); i++) { // my_string 문자열 개수만큼 for문 
	            char c = my_string.charAt(i); // 문자열의 문자하나하나를 c에 담기
	            
	            if(c >= 'A' && c <= 'Z') { // 대문자인경우
//	            	answer[c - 'A']++; 
	            	answer[c - 65]++; // 아스키코드 A = 65
	            }else if(c >= 'a' && c <= 'z'){ // 소문자인경우
//	            	answer[26+c-'a']++; 
	            	answer[26+c-97]++; // 소문자는 대문자가 끝난 26번째부터
	            					   // 아스키코드 a = 97
	            }
	        }
