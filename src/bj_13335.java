import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_13335 {
    public static  void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int time = 0;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        Queue<Integer> truck = new LinkedList<>();
        for(int i=0; i<n; i++){
            truck.add(Integer.parseInt(st.nextToken()));
        }
        Queue<Integer> bridge = new LinkedList<>();
        //다리길이만큼 큐에0추가
        for(int i=0; i<w; i++){
            bridge.add(0);
        }
        while (!bridge.isEmpty()){
            time++;
            sum -= bridge.poll();

            //비어있으면 패스
            if(truck.isEmpty()){
                continue;
            }

            if(truck.peek()+sum<=L){//더해서 지나갈수있는지 비교
                int x = truck.poll();
                sum += x;
                bridge.add(x);
            }else {
                bridge.add(0);
            }
        }
        System.out.println(time);

    }
}
