import java.util.HashMap;
import java.util.Map;

public class pg_할인행사 {
    public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            if (isMap(wantMap, discountMap)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isMap(Map<String, Integer> a, Map<String, Integer> b) {
        for (String key : a.keySet()) {
            if (b.getOrDefault(key, 0) != a.get(key)) {
                return false;
            }
        }
        return true;
    }
}
}
