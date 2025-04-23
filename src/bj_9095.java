import java.util.Scanner;

public class bj_9095 {
    public static int trop(int n){
        int cnt =0;
        if(n==0) return 1;
        if(n<0) return 0;
        cnt += trop(n-1);
        cnt += trop(n-2);
        cnt += trop(n-3);
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            System.out.println(trop(n));
        }
    }
}
