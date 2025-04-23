import java.util.*;
public class bj_14501 {
    public static int n;
    public static int[] T ;
    public static int[] P ;
    public static int max = 0;

    public static void leave(int idx, int total){
        if(idx==n){
            max=Math.max(total,max);
            return;
        }
        if (idx+T[idx]<=n) leave(idx+T[idx], total+P[idx]);
        leave(idx+1, total);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        T = new int[n];
        P = new int[n];
        for(int i=0; i<n; i++){
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }
        leave(0,0);
        System.out.println(max);
    }
}
