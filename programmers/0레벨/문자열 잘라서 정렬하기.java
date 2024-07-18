import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("x") && !str[i].equals("")) 
                list.add(str[i]);
        }
        
        Collections.sort(list); // 리스트 정렬 
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
