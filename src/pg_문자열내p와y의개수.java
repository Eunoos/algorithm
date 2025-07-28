public class pg_문자열내p와y의개수 {
    class Solution {
    boolean solution(String s) {
         s = s.toLowerCase();  // 소문자로 통일
        long pcnt = s.chars().filter(c -> c == 'p').count();
        long ycnt = s.chars().filter(c -> c == 'y').count();
        return pcnt == ycnt;
    }
}
}
