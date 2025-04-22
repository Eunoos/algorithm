import java.io.*;
import java.util.*;
 public class bj_1389 {
     static int N,M;
     static ArrayList<Integer>[] arr;

     static int[] dist;

     static int BFS(int st){
         Arrays.fill(dist, -1); //초기화
         int cnt = 0;
         Queue<Integer> queue = new LinkedList<>();
         queue.add(st);
         dist[st] = 0;

         while (!queue.isEmpty()){
             int x = queue.poll(); //헤더 제거하고 저장
             for (int y : arr[x]){
                 if (dist[y] != -1) continue; //방문확인
                 dist[y] = dist[x]+1;
                 cnt+= dist[y]; //이동횟수 더하기
                 queue.add(y);
             }
         }
         return cnt;
     }
     public static void main(String[] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         arr = new ArrayList[N+1]; //N번
         dist = new int[N+1];

         for(int i=1; i<=N;i++){
             arr[i] = new ArrayList<>();
         }

         for(int i=0; i<M; i++){
             st = new StringTokenizer(br.readLine());
             int A = Integer.parseInt(st.nextToken());
             int B = Integer.parseInt(st.nextToken());
             arr[A].add(B);
             arr[B].add(A);
             //양방향
         }
         int min = Integer.MAX_VALUE;
         int idx = 0;
         for (int i=1; i<=N; i++){
             int cnt = BFS(i);
             if(cnt<min){
                 min = cnt;
                 idx = i; //정점 갱신
             }
         }
         System.out.println(idx);
     }

 }
