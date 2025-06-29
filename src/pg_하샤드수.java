public class pg_하샤드수 {
    class Solution {
    public boolean solution(int x) {
        int n = 0;
        int temp = x;
        while(temp>0){
            n+=temp%10;
            temp/=10;
        }
        
        return x%n==0 ? true : false;
    }
}
}
