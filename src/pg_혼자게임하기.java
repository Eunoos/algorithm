import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int n = cards.length;
        boolean[] visited = new boolean[n];
        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int cnt = 0;
            int curr = i;

            while (!visited[curr]) {
                visited[curr] = true;
                curr = cards[curr] - 1; 
                cnt++;
            }
            if (cnt > 0) sizes.add(cnt);
        }

        if (sizes.size() < 2) return 0;
        sizes.sort(Collections.reverseOrder());
        return sizes.get(0) * sizes.get(1);
    }
}