import java.util.*;


public class pg_연속부분수열합의개수 {
class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        for (int l = 1; l <= n; l++) {
            for (int st = 0; st < n; st++) {
                int sum = 0;
                for (int i = 0; i < l; i++) {
                    sum += elements[(st + i) % n];//원형인걸 생각
                }
                sumSet.add(sum);
            }
        }
        return sumSet.size();
    }
}
}
