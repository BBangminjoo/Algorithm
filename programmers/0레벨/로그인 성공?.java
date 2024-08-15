class Solution {
    public String solution(String[] id_pw, String[][] db) {
		String answer = "fail"; // id_pw[0],[1]모두 다를 때

        for(int i = 0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) { // id_pw[0],[1]모두 같을 때
                    answer = "login"; 
                } else { // id_pw[0]만 같을 때
                    answer = "wrong pw"; 
                }
            }
        }
        return answer;
    }
}
-------------------------------------------------------------------------------
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
		for (int i = 0; i < db.length; i++) {
			// id_pw[0]만 같을 때
			if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				answer = "wrong pw";
				break;
			}
			// id_pw[0],[1]모두 같을 때
			if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
				// id_pw[0],[1]모두 다를 때
			} else {
				answer = "fail";
			}
		}        
        return answer;
    }
}	
