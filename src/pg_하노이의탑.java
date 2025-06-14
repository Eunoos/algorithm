import java.util.*;

class Solution {
    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        return answer.toArray(new int[answer.size()][]);
    }

    public void hanoi(int n, int st, int end, int to) {
        if (n == 1) {
            answer.add(new int[]{st, end});
            return;
        }

        hanoi(n - 1, st, to, end);
        answer.add(new int[]{st, end});
        hanoi(n - 1, to, end, st);
    }
}