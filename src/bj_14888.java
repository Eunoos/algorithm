import java.util.*;
public class bj_14888 {
    public static int n;//수의 개수
    public static int[] A = new int[11];//수들의 배열
    public static int[] op = new int[4];//연산자 배열
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static void calculation(int total, int idx, int add, int sub, int multi, int div){
        if(idx == n){
            max = Math.max(max, total);
            min = Math.min(min, total);
            return;
        }
        if(add>0) calculation(total+A[idx], idx+1, add-1, sub, multi, div);
        if(sub>0) calculation(total-A[idx], idx+1, add, sub-1, multi, div);
        if(multi>0) calculation(total*A[idx], idx+1, add, sub, multi-1, div);
        if(div>0) calculation(total/A[idx], idx+1, add, sub, multi, div-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++) A[i] = sc.nextInt();
        for(int i=0; i<4; i++) op[i] = sc.nextInt();
        calculation(A[0],1, op[0], op[1], op[2], op[3]);
        System.out.println(max);
        System.out.println(min);
    }
}
