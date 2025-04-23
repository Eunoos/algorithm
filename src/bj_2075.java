import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class bj_2075 {
    public static  void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        //최소 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //최대 힙
//        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((x,y) -> y-x);

        //입력 받기
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++){
                maxpq.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for (int i=0; i<N-1; i++){
            maxpq.poll();
        }
//        wr.write();

    }
}
