import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_24444 {

    static int n,m,v;
    static ArrayList<Integer>[] graph;
    static int [] visited;//0이면false
    static StringBuilder sb= new StringBuilder();

    public static void bfs(int start) {

        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        int cnt = 1;
        visited[start] = cnt++;
        //큐에 노드를 저장해야함(해당 노드의 자식 노드를 방문하기 위해서)횟수+

        //큐 안에 있는 노드가 모두 없을 때까지 순회를 진행
        //부모 노드를 큐에서 꺼내고, 해당 부모노드의 자식노드들을 모두 큐에 넣는다.
        //자식 노드가 없는 노드는 그냥 삭제됨
        while(!que.isEmpty()) {
            //부모 노드를 큐에서 꺼낸다.(꺼낸 순서 => 경로 순서)
            int node = que.poll(); //큐에서 값을 반환한 뒤 삭제
            for(int i=0; i<graph[node].size(); i++){
                int v = graph[node].get(i);
                if(visited[v] != 0) continue;

                que.offer(v); //큐에 노드 추가
                visited[v] = cnt++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        v = Integer.parseInt(str[2]);

        visited = new int [n+1];
        graph = new ArrayList[n+1];

        for(int i=0; i<n+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1; i<=n; i++){
            Collections.sort(graph[i]);
        }
        bfs(v);
        for(int i=1; i<=n; i++){
            System.out.println(visited[i]);
        }
    }


}
