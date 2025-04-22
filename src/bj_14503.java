import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14503 {
    static int N,M,r,c,d;
    static int ans = 0;
    static int[][] map;
    static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

    static void dfs(int r, int c, int d){
        //현재위치청소
        map[r][c] = -1;

        //주변상하좌우확인
        for(int i = 0; i<4; i++){
            d = (d+3)%4; //상우하좌
            int dx = c+dir[d][0];
            int dy = r+dir[d][1];
            if(0<=dx && dx<M && 0<=dy && dy<N && map[dx][dy] ==0){
                ans++;
                dfs(dx, dy, d);

                return;
            }

            int back = (d+2)%4;
            int bx = c + dir[back][0];
            int by = r + dir[back][1];

            if(bx>=0 && bx<M && by>=0 && by<N && map[bx][by] != 1){
                dfs(bx, by, d);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(r, c, d);
        System.out.println(ans);
    }
}
