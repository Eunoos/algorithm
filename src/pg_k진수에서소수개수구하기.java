public class pg_k진수에서소수개수구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        int st = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (st < i) { // substring이 빈 문자열이 아닐 경우만
                    String x = s.substring(st, i);
                    long b = Long.parseLong(x); // int 범위를 넘어설 수 있어 long 사용
                    if (isPrime(b)) {
                        answer += 1;
                    }
                }
                st = i + 1;
            }
        }
        
        // 예외 처리
        if (st < s.length()) {
            String x = s.substring(st);
            long b = Long.parseLong(x);
            if (isPrime(b)) {
                answer += 1;
            }
        }

        return answer;
    }

    //소수판별
    public static boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (long i = 3; i <= Math.sqrt(number); i += 2) {  //
            if (number % i == 0) return false;
        }

        return true;
    }
}
