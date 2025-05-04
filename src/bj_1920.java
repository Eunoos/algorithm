import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class bj_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];    

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);  

        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            int mid = (arr.length / 2);    //이진탐색
            if (a >= arr[mid]) {          
                for (int j = mid; j < arr.length; j++) {
                    if (arr[j] == a) {
                        result[i] = 1;
                        break;
                    }
                }
            } else {
                for (int j = mid - 1; j >= 0; j--) {
                    if (arr[j] == a) {
                        result[i] = 1;
                        break;
                    }
                }
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}