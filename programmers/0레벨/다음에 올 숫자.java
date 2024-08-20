class Solution {
    public int solution(int[] common) {
		int n = common.length;
		
		// 등차수열인지 확인
		if(common[1]-common[0] == common[2]-common[1]) {
			// 다음항 예측(등차수열) => 등차수열 공식 : a + (n-1)d

			return common[n-1] + (common[n-1]-common[n-2]);
		} 
		//다음항예측(등비수열) 
		return common[n-1] * (common[n-1]/common[n-2]);
    }
}
