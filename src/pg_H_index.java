import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i; // h편 이상 인용된 논문 수
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
