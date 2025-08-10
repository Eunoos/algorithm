public class pg_가운데글자가져오기 {
    class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        int n = str.length;
        return n%2 == 1 ? str[n/2] : str[n/2-1]+str[n/2];
    }
}
}
