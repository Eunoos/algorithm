public class pg_롤케이크자르기 {
    class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        int[] left = new int[10001];   
        int[] right = new int[10001];  

        int l = 0;
        int r = 0;

        // 오른쪽에 전체 토핑 종류 세기
        for (int n : topping) {
            if (right[n] == 0) r++;
            right[n]++;
        }
         // 한 칸씩 자르면서 왼쪽으로 이동 후 오른쪽에서 제거
        for (int i = 0; i < topping.length; i++) {
            int n = topping[i];

            if (left[n] == 0) l++;
            
            left[n]++;
            right[n]--;
            
            if (right[n] == 0) r--;

            if (l == r) answer++;
            
        }
        return answer;
    }
}
}
