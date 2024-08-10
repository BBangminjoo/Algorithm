class Solution {
    public int solution(String[] spell, String[] dic) {
		int answer = 2; //존재하지 않을 때 2
		int index = 0;
		for(int i=0;i<dic.length;i++) {
			index = 0;
			for(int j=0;j<spell.length;j++) {
				if(dic[i].contains(spell[j])) {
					index++;
				}
				if(index==spell.length){//index가 3이 되었을 때
					answer = 1;
				}
				
			}
		}
        return answer;
    }
}
