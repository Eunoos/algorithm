
import java.util.Scanner;

public class al_0411 {

    public static int binoCoe(int n, int r){
        if(r == n || r == 0) return  1;
        return binoCoe(n-1, r-1)+binoCoe(n-1,r);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binoCoe(n, r));
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
