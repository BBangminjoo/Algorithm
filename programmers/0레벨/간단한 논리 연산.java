class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer;
        // ∨ : 논리합 or, ∧ : 논리곱 and
        answer = ( x1 || x2 ) && ( x3 || x4 );
        return answer;
    }
}
