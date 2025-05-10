class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.toLowerCase().split(" ", -1); // 핵심: -1로 설정
        for (String str : strs) {
            if (!str.isEmpty()) {
                answer += Character.toUpperCase(str.charAt(0));
                if (str.length() > 1) {
                    answer += str.substring(1);
                }
            }
            answer += " ";
        }

        return answer.substring(0, answer.length() - 1); // 마지막 공백 제거
    }
}
