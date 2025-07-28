public class pg_x만큼간격이있는n개의숫자 {
    class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx = (long) x;
        for(int i=0; i<n; i++){
            answer[i] = lx*(i+1);
        }
        return answer;
    }
}
}
