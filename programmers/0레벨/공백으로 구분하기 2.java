class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+"); //  "\\s+"를 이용하면 공백, 탭 등의 문자가 하나 이상 있을 시에 묶어서 split 해줌

        return answer;
    }
}
