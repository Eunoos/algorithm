public class pg_큰수만들기 {
    class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0; 
        int len = number.length();
        int n = len - k;

        for (int i = 0; i < n; i++) {
            char max = '0';
            for (int j = idx; j <= k + i; j++) {
                if (number.charAt(j) > max) {
                    max = number.charAt(j);
                    idx = j + 1; 
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }
}
}
