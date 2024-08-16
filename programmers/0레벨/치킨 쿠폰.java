class Solution {
    public int solution(int chicken) {
		int service = 0; // 서비스 치킨의 개수
		
		while(chicken>=10) { // 치킨 쿠폰이 10장이상일 때까지 반복
			service += chicken / 10; // 10장당 서비스 치킨 한마리 
			// 남은 쿠폰 = 서비스 치킨으로 교환 후 남은 쿠폰 + 서비스 치킨의 쿠폰 
			chicken = chicken / 10 + chicken % 10; 
		}
        return service;
    }
}
