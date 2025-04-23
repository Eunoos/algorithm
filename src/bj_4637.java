import java.util.Arrays;

public class bj_4637 {
    public static void main(String[] args) {
        boolean selfNumbers [] = new boolean[10001];
        selfNumbers[0] = false;
        Arrays.fill(selfNumbers, true);
        boolean isfound = false;
        for(int m=1; m<=10000; m++){
            for(int n = 1; n<m; n++){
                int num = n;
                int temp = n;
                while(temp!=0){
                    num += temp%10;
                    temp /= 10;
                }
                if(num == m){
                    selfNumbers[m] = false;
                    break;
                }
            }
        }
        for(int i=1; i<selfNumbers.length; i++){
            if(selfNumbers[i]) System.out.println(i);
        }
    }
}
