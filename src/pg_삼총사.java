public class pg_삼총사 {
    class Solution {
    
    int answer = 0;
    public int solution(int[] number) {
        dfs(number, 0, 0, 0);
        return answer;
    }

    private void dfs(int[] number, int idx, int s, int d) {
        if (d == 3) {
            if (s == 0) answer++;
            return;
        }
        for (int i = idx; i < number.length; i++) {
            dfs(number, i + 1, s + number[i], d + 1);
        }
    }
}
}
