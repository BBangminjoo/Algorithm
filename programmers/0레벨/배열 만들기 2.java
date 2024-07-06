import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer= {};
        
        List list =new ArrayList();
        for(int i=l;i<=r;i++){
            String s =String.valueOf(i);// String타입으로 형변환(문자열로 바꾸기)
            // 0과5가 있는지 비교하고, 그 나머지 값은 존재하지 않는경우 list에 추가하기
            if((s.contains("0")||s.contains("5")) // 0 or 5 
            		&&!s.contains("1")&&!s.contains("2")&&!s.contains("3")
            		&&!s.contains("4")&&!s.contains("6")&&!s.contains("7")
            		&&!s.contains("8")&&!s.contains("9")){ // 0~9 중 0,5가 아니면 
                list.add(Integer.parseInt(s)); // list에 int타입으로 형변환해서 추가하기
            }
        }
       
        if(list.isEmpty()) { //list가 비어있으면 
        	answer=new int[1]; //answer에 방을 하나 만들기
        	answer[0]=-1; // 그 방 하나 즉, 0번째 방에 -1을 담기
        }else { // list가 비어있지 않으면 
        	 answer = new int[list.size()]; // list의 크기만큼 방 만들기
        	for(int i=0;i<answer.length;i++){ // answer의 길이만큼 for문
                answer[i]=(int)list.get(i); // answer배열에 list에 담긴 정수 가져오기 
            }
        }
        return answer;
    }
}
