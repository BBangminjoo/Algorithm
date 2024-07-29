import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
      int[] answer = new int[numbers.length];
      List list =new ArrayList();
      for(int i=0;i<numbers.length;i++) {
         list.add(numbers[i]);
      }
      int a = (int) list.get(list.size()-1);
      
      if(direction.equals("right")) { // 방향이 오른쪽일 경우
         list.remove((int) list.size()-1);
         list.add(0, a);
      }else if(direction.equals("left")) { // 방향이 왼쪽일 경우
         int b = (int)list.get(0);
    	 list.remove(0);
         list.add(b);
      }
      for(int i=0; i<answer.length;i++) {
    	  answer[i] = (int)list.get(i);
      }
        return answer;
    }
}
