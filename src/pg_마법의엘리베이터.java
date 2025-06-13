class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int n = storey % 10;
            int next = (storey / 10) % 10;  // 다음 자리 수 확인
            if (n > 5) {
                answer += 10 - n;
                storey += 10;
            } else if (n < 5) {
                answer += n;
            } else { 
                // 다음 자리 수가 5 이상이면 올림
                if (next >= 5) {
                    answer += 5;
                    storey += 10;
                } else {
                    answer += 5;
                }
            }
            storey /= 10;
        }

        return answer;
    }
}