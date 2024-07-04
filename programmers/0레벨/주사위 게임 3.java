import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
		int answer = 0;
		int p = 0;
		int q = 0;
		int r = 0; 
		int arr[] = {a,b,c,d};
		Arrays.sort(arr);
		a = arr[0]; b=arr[1]; c=arr[2]; d=arr[3]; // a-d를 낮은수부터 정렬
		
		// 4개 모두 같을 때 
		if(a==b && a==d) {
			p = a;
			answer = p*1111;			
		}
		// 3개만 같은 숫자일 때
		// 1) a==c
		else if(a==c) {
			answer = (10*a+d)*(10*a+d);
		}
		// 2) b==d
		else if(b==d) {
			answer = (10*b+a)*(10*b+a);
		}
		
		// 2개씩 같을 때
		else if(a==b && c==d) {
			answer = c*c-a*a;
		}
		// 2개만 같을 때
		// 1) a==b
		else if(a==b) {
			answer = c*d;
		}
		// 2) b==c
		else if(b==c) {
			answer = a*d;
		}
		// 3) c==d
		else if(c==d) {
			answer = a*b;
		}

		// 모두 다를 때!!
		else {
			answer = a;
		}
        return answer;
    }
}
