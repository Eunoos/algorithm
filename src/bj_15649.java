import java.util.*;

public class bj_15649 {

    static  int n,m;
    static int[] used, ans;
    static StringBuilder sb = new StringBuilder();
    public static void permutations(int len){
        if(len == m){
            for(int i:ans) sb.append(i+" ");
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++){
            if(used[i]==0){
                ans[len] = i;
                permutations(len+1);
            }

        }
    }

    public static void main(String[] args) {
        //순열문제
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //전체 수
        m = sc.nextInt(); //길이

        used = new int[n+1];
        ans = new int[m];

        permutations(0);
        System.out.println(sb.toString());
    }
}
