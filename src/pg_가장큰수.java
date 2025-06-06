import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        
        // 두 문자열을 합친 결과를 비교해서 더 큰 쪽이 앞으로 오도록 내림차순
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        for (String s : strs) {
            answer+= s;
        }
        
        // "0000"같은 경우의 예외처리
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}