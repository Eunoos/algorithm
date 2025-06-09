import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        dfs(numbers, "", 0);
        
        for (int num : set) {
            if (isPrime(num)) answer++;
        }
        return answer;
    }

    public void dfs(String numbers, String str, int d) {
        if (!str.equals("")) {
            set.add(Integer.parseInt(str));
        }

        if (d == numbers.length()) return;

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, str + numbers.charAt(i), d + 1);
                visited[i] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}