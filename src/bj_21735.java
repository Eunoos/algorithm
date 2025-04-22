import com.sun.source.tree.ContinueTree;

import java.io.IOException;
import java.util.*;

public class bj_21735 {
    static int N,M, ans;
    static int[] arr;

    public static void dfs(int idx, int cnt, int time) {
        if (time > M) {
            System.out.println(ans);
            return;
        }
        ans = Math.max(ans, cnt);
        if(idx<N) dfs(idx+1, cnt+arr[idx+1], time+1);
        if(idx<N-1) dfs(idx+2, cnt/2+arr[idx+2], time+1);
    }

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        N = Integer.parseInt(strings[0]);
        M = Integer.parseInt(strings[1]);
        ans = 0;
        strings = sc.nextLine().split(" ");
        arr = new int[N+1];
        for(int i=0; i<N; i++){
            arr[i+1] = Integer.parseInt(strings[i]);
        }
        dfs(0,1,0);
        System.out.println(ans);
    }
}
