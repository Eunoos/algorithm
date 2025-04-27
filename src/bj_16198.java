import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_16198 {
    static int n;
    static ArrayList<Integer> cards = new ArrayList<>();
    static long ans = 0;

    public static void solve(int size, long total){
        if(size==2){
            ans = Math.max(ans, total);
            return;
        }

        for(int i=1; i<size-1; i++){
            int a = cards.get(i);
            int temp = cards.get(i-1) * cards.get(i+1);
            cards.remove(i);
            solve(size-1, total+temp);
            cards.add(i, a);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            cards.add(Integer.parseInt(st.nextToken()));
        }

        solve(n, 0);
        System.out.println(ans);
    }
}

