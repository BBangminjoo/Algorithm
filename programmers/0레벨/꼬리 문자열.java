class Solution {
    public String solution(String[] str_list, String ex) {
		String[] answer = {};
		List list = new ArrayList();
		for(int i=0; i<str_list.length; i++) {
			if(!str_list[i].contains(ex)) {
				list.add(str_list[i]);
			}
		}
		
		answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (String)list.get(i);
		}
	    
		String result = String.join("",answer); 
        return result;
    }
}
