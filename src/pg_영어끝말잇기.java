public class pg_영어끝말잇기 {
    class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        String st = words[0];
        for(int i=1; i<words.length; i++){
            for(int j=0; j<i; j++){
                if(words[j].equals(words[i])){
                    answer[0]=i%n +1;
                    answer[1]=i/n +1;
                    return answer;
                }
            }
            char a = st.charAt(st.length()-1);
            char b = words[i].charAt(0);
            if(a!=b){
                answer[0]=i%n +1;
                answer[1]=i/n +1;
                return answer;
            }
            st = words[i];
        }

        return answer;
    }
}
}
