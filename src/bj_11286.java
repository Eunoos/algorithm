import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class bj_11286 {
    public static  void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((x,y) -> {
            int absX = Math.abs(x);
            int absY = Math.abs(y);
            if(absX == absY){
                return x - y;
            }
            return absX - absY;
        });
        while (n-->0){
            int X = Integer.parseInt(st.nextToken());
            if (X == 0) {

            }
        }

    }
}
