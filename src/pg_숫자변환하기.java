import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1]; 
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int current = now[0];
            int count = now[1];
            if (current == y) {
                return count;
            }
            
            int[] next = new int[] { current + n, current * 2, current * 3 };
            for (int num : next) {
                if (num <= y && !visited[num]) {
                    visited[num] = true;
                    queue.offer(new int[]{num, count + 1});
                }
            }
        }
        
        return -1; 
    }
}
