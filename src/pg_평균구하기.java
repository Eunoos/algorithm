public class pg_평균구하기 {
    class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(double n : arr){
            answer+=n;
        }
        return answer/arr.length;
    }
}
}
