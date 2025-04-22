import java.util.*;

public class bj15663 {

    static  int n,m;
    static int[] ans, input;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int cnt, int idx){
        if(cnt==m){
            for(int i:ans) sb.append(i).append(" ");
            sb.append("\n");
            return;
        }
        int prevent = 0;
        for (int i = idx; i < n; i++) {
            if(prevent != input[i]&&!used[i]){
                used[i] = true;
                ans[cnt] = input[i];
                prevent = input[i];
                dfs(cnt+1, i+1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        //조합문제
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //전체 수
        m = sc.nextInt(); //길이
        input = new int[n];
        used = new boolean[n];
        ans = new int[m];

        for(int i = 0; i<n; i++){
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        dfs(0,0);
        System.out.println(sb.toString());
    }
}
