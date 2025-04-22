import java.io.*;
import java.util.*;

public class bj_4963 {

    static int w,h;
    static int[][] map;
    static boolean[][] visited; //방문여부확인

    //상하좌우
    static int[][] di = {{-1,0},{1,0},{0,-1},{0,1},{1,1},{-1,-1},{-1,1},{1,-1}};

    public static void dfs(int x, int y){

        visited[y][x] = true;

        //상하좌우로 이동
        for(int i=0; i<8; i++){
            //현재 위치(x,y)에서 움직일 새로운 방향(nx,ny)
            int nx = x + di[i][1];
            int ny = y + di[i][0];
            if(nx < 0 || ny < 0 || nx >=w || ny >= h || map[ny][nx]==0) continue;
            if(!visited[ny][nx]) {
                dfs(nx, ny);
            }

        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w==0) break;

            map = new int[h][w];
            visited = new boolean[h][w];

            for(int i=0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; i<w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            //모든 좌표에 대해서 dfs 돌릴 수 있는지(연결 요소) 확인
            int cnt = 0;
            for(int y=0; y<h; y++) {
                for(int x=0; x<w; x++) {
                    if(map[y][x]==1 && !visited[y][x]) {
                        dfs(x,y);
                        cnt++;
                    }
                }
            }

            bw.write(cnt+"\n");
            bw.flush(); //버퍼비우기
        }

        bw.close();
        br.close();
    }
}
