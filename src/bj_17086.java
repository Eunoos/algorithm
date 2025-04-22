import java.io.*;
import java.util.*;
public class bj_17086 {
    static int N, M, ans;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, 1, -1, -1, 1, 1, -1};

    static int bfs(int x, int y){
        visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y, 0});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            for(int i=0; i<8; i++){
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];
                int cnt = arr[2];
                if( nx<0 || ny<0 || nx>=N || ny>=M ) continue;
                if(visited[nx][ny]) continue;
                if(graph[nx][ny]==1) return cnt+1;
                visited[nx][ny] = true;
                queue.add( new int[] {nx, ny, cnt+1} );
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = 0;
        graph = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int val = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(graph[i][j] == 1 ) continue;
                val = bfs(i,j);
                ans = Math.max(val, ans);
            }
        }


        System.out.println(ans);
    }
}
