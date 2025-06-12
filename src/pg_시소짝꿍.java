import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int weight : weights) {
            int[][] d = {{1, 1}, {2, 3}, {3, 2}, {3, 4}, {4, 3}};
            for (int[] r : d) {
                int num = r[0], n = r[1];

                if ((weight * num) % n != 0) continue;

                int target = (weight * num) / n;

                answer += map.getOrDefault(target, 0);
            }

            map.put(weight, map.getOrDefault(weight, 0) + 1);
        }

        return answer;
    }
}
//수정해야함
