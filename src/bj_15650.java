import java.util.*;

public class bj_15650 {

    static  int n,m;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void combination(int idx, int len){
        if(len==m){
            for(int i:ans) sb.append(i+" ");
            sb.append("\n");
            return;
        }
        for(int i=idx; i<=n; i++){
            ans[len]=i;
            combination(i, len+1);
        }
    }

    public static void main(String[] args) {
        //조합문제
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //전체 수
        m = sc.nextInt(); //길이


        ans = new int[m];

        combination(1, 0);
        System.out.println(sb.toString());
    }
}
