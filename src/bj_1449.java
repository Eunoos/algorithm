import java.util.*;
public class bj_1449 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int L = Integer.parseInt(strings[1]);
        int[] arr = new int[N];
        strings = sc.nextLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        int ans = 1;
        int cnt = 1;
        for(int i=1; i<N; i++){
            cnt+=arr[i]-arr[i-1];
            if(cnt>L){
                cnt=1;
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
