import java.util.*;
public class bj_2485 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ints = new int[N];
        ints[0] = sc.nextInt();
        int [] arr = new int[N-1];
        int gcd = 0;
        for(int i=1; i<N; i++){
            ints[i] = sc.nextInt();
            arr[i-1] = ints[i]-ints[i-1];
        }
        for(int i=0; i<N-1; i++){
            int a = arr[i];
            int b = gcd;
            while (b!=0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            gcd=a;
        }
        int cnt = 0;
        for(int i=0; i<N-1; i++){
            cnt += (arr[i]/gcd)-1;
        }
        System.out.println(cnt);
    }
}
