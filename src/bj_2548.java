import java.util.*;
public class bj_2548 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Integer[] arr = new Integer[N];
        String[] strings = sc.nextLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=arr[0]; i<=arr[N-1]; i++){
            int cnt = 0;
            for(int j=0; j<N; j++){
               if(i>arr[j]){cnt+=i-arr[j];}else{cnt+=arr[j]-i;}
            }
            if(cnt<result){
                result=cnt;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
