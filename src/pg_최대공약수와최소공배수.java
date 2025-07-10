public class pg_최대공약수와최소공배수 {
    class Solution {
    public int[] solution(int n, int m) {
        int gcd = GCD(n, m);
        int lcm = (n * m) / gcd;

        return new int[]  {gcd, lcm};
    }

    public int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
}
