class Solution {
    public int solution(int n) {
        int answer = 0;
        int ncnt = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("1")) {
                ncnt++;
            }
        }
        while(true){
            n+=1;
            int scnt = 0;
            String s = Integer.toBinaryString(n);
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i+1).equals("1")) {
                    scnt++;
                }
            }
            if(scnt==ncnt){
                answer = n;
                break;
            }
        }
        return answer;
    }
}