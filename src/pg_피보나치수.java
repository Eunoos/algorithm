public class pg_피보나치수 {
    class Solution {
    public int solution(int n) {
        int answer = 1;
        int F1 = 1;
        int F2 = 1;
        for(int i=2; i<n; i++){
            answer = (F1 + F2) % 1234567; //오버플로방지
            F1 = F2;
            F2 = answer;
        }
        return answer;
    }
}
}
