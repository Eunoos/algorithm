import java.util.Arrays;
public class pg_정수내림차순배치하기 {
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr)).reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
}
