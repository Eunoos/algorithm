class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        while(!s.equals("1")){
            String str = "";
            for (String t : s.split("")){
                if(t.equals("1")){ //문자열 비교는 equals()
                    str += t;
                } else {
                    answer[1] += 1;
                }
            }
            int i = str.length();
            s = Integer.toBinaryString(i);
            answer[0] += 1;
        }
        return answer;
    }
}