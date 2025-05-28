import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] x : clothes) {
            map.put(x[1], map.getOrDefault(x[1], 0) + 1);
        }

        for (int n : map.values()) {
            answer *= (n + 1); // 안 입는 것도 생각
        }
        return answer-1;//다 안입는경우 빼주기
    }
}
