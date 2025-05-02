import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_24480 {

    public static ArrayList<Integer> graph[];
    public static boolean visited[];
    public static int order[];

    public static int count = 1;
    public static int N,M, start;


    public static void dfs(int node) {

        visited[node]=true;
        order[node] = count++;

        for(int i=0; i<graph[node].size(); i++){
            int v = graph[node].get(i);
            if(!visited[v]) {
                dfs(v);
            }
        }
    }
    //100글자 => Buffer(임시 저장소) 에 50글자씩 =>String 형태로
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        order = new int[N+1];

        graph = new ArrayList[N+1];
        for(int i=0; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);

        }

        for(int i=0; i<=N ; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());//내림차순 정렬
        }

        dfs(start);

        for(int i=1; i<=N; i++) {
            bw.write(order[i]+"\n");
        }
        bw.flush(); //버퍼비우기
        bf.close(); //리소스 반납
        bw.close();

    }
}
