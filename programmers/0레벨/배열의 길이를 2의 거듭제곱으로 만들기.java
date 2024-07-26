class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
		// 배열 arr의 길이 구하기
		for (int i = 0; i < arr.length; i++) {
			// 2의 정수 거듭제곱보다 작거나 같을 경우
			System.out.println(arr.length + "  " + Math.pow(2, i));
			if (arr.length <= Math.pow(2, i)) {
				answer = new int[(int) Math.pow(2, i)];
				break;	
			}
		}
		//System.arraycopy(src, srcPos, dest, destPos, length);
		/*
		src : 복사할 배열
		srcpos : src의 시작 배열
		dest : 복사 당할 배열
		destpos : dest의 시작 배열
		length : src의 복사 길이 
		 */
		System.arraycopy(arr, 0, answer, 0, arr.length);        
        return answer;
    }
}
