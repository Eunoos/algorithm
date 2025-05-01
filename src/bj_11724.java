import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_11724 {

    public static ArrayList<Integer> graph[];
    public static boolean visited[];

    public static int N,M; 


    public static void dfs(int node) {

        visited[node]=true; 

        for(int i=0; i<graph[node].size(); i++){
            int v = graph[node].get(i); 
            if(!visited[v]) {
                dfs(v);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
        for(int i=0; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            //정점들을 연결
            graph[u].add(v);
            graph[v].add(u);

        }

        int count = 0;
        for(int i=1; i<=N; i++) {
            //방문하지 않은 정점에 대해서 dfs를 돈다 (방문하지 않았다 = 새로운 연결 요소를 찾았다)
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        //bufferedwriter에서 int를 출력하면 아스키코드 값이 출력되므로 문자열로 변환해서 출력
        bw.write(String.valueOf(count));
        bw.flush(); //버퍼비우기
        bf.close(); //리소스 반납
        bw.close();
    }
}
