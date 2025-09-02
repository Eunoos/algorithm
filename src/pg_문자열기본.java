public class pg_문자열기본 {
    class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("\\d+");
    }
}
}
