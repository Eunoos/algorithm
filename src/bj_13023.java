import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_13023 {

    static int n, m;
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static int ans = 0;
    public static void dfs(int start, int depth) {
        if(depth == 4) {
            //깊이가 5인 경로를 찾으면
            //1로 저장한다.
            ans = 1;
            return;
        }

        for(int i=0; i<graph[start].size(); i++) {
            int v = graph[start].get(i);
            if(!visited[v]) {
                //백트래킹(깊이가 4인 다른 경로가 있을 수 있으므로)
                visited[start] = true;
                dfs(v, depth+1);
                visited[start] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
    //0~ n-1 번째 노드를 모두 순회하면서 깊이 4인 경로를 찾는다.
        for(int i=0; i<n; i++) {
            dfs(i, 0);
            //만약 가능한 경로가 1개라도 있으면 멈춘다.
            if(ans ==1 ) break;
        }

        System.out.print(ans);
    }
}

