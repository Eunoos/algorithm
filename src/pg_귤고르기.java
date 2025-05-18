import java.util.*;

public class pg_귤고르기 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            int total = 0;
            HashMap<Integer, Integer> cntMap = new HashMap<>();
            
            //각 크기별 귤 개수 세기
            for(int x : tangerine){
                cntMap.put(x, cntMap.getOrDefault(x, 0)+1);
            }
            
            //무거운 순으로 정렬 후 귤 담아서 k개수 보다 많으면 종료
            List<Integer> arr = new ArrayList<>(cntMap.values());
            arr.sort(Collections.reverseOrder());
            
            for (int x : arr) {
                total += x;
                answer++;
                if (total >= k) break;
            }
            return answer;
        }
    }
}
