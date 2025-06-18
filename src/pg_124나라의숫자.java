class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        //처음엔 분자열로 구현하였으나 시관초과로 인해 스트링빌더사용
        
        while (n > 0) {
            int x = n % 3;

            if (x == 0) {
                sb.append('4');
                n = n / 3 - 1;
            } else {
                sb.append(x);
                n = n / 3;
            }
        }

        return sb.reverse().toString();
    }
}
