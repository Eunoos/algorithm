import java.util.Arrays;

public class pg_구명보트 {
    class Solution {
    public int solution(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        int answer = 0;
        Arrays.sort(people);
        while (l <= r) {
            // 가장 가벼운 사람 + 가장 무거운 사람을 태울 수 있다면 둘 다 태움
            if (people[l] + people[r] <= limit) {
                l++;
            }
            // 무거운 사람은 항상 태워야 하므로, 보트 하나 씀
            r--;
            answer++;
        }

        return answer;
    }
}
}
