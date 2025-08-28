public class pg_약수의개수 {
    class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int n = (int)Math.sqrt(i);
           answer = n * n == i ? answer - i : answer + i;
        }
        return answer;
    }
}
}
