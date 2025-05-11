class Solution {
    public int solution(int n) {
        int answer = 0;
        //처음엔 Array에 담아 풀었으나 시간복잡도가 초과해 수정
        for(int st=1; st<=n; st++){
            int sum = 0;
            for(int i=st; i<=n; i++){
                sum+=i;
                if(sum==n){
                    answer++;
                    break;
                }else if(sum>n){
                    break;
                };
            }
        }
        return answer;
    }
}