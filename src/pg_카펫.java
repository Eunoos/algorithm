public class pg_카펫 {
    class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];
        for (int h = 3; h <= total / h; h++) {
            if (total % h == 0) {
                int w = total / h;
                int n = (w* 2) + (h - 2) * 2;
                if (n == brown) {
                    answer[0]=w; answer[1]=h;
                }
            }
        }
        return answer;
    }
}
}
