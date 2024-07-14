class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0; // intervals에서 각 방마다의 배열의 길이를 담아줄 변수 선언 
        int count = 0; // for문 한번 돌때마다 1씩 증가시켜줄 변수 선언
        
        for(int i=0; i<intervals.length; i++){ // intervals의 각 방마다 길이를 찾아줄 for문
            int[] arrIndex = intervals[i]; 
            length += arrIndex[1] - arrIndex[0] + 1; // [1,3]이라고 치면 3-1=2, 하지만 1,3의 길이는 2,3,4로 3개가 나와야 하므로 +1하기
        }
        
        int[] answer = new int[length]; // 첫번째방, 두번째방 모두 합친 배열의 길이를 새로운 answer에 담기 
        
        for(int i=0; i<intervals.length; i++){ 
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){ 
                answer[count] = arr[j]; // answer 방에 차례대로 arr[j] 담기 
                count++; 
            }
        }
        return answer;
    }
}
