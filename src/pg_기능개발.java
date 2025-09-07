import java.util.*;
public class pg_기능개발 {
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int n = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(n);
        }
        
        List<Integer> answer = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int x = q.poll(); 
            int cnt = 1;
            
            
            while (!q.isEmpty() && q.peek() <= x) {
                q.poll();
                cnt++;
            }
            
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
}
