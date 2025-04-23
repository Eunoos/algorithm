import java.util.*;
public class bj_9417 {
    public static int gcd(int a, int b){
        if (a%b == 0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int n=0; n<N; n++){
            String[] strings = sc.nextLine().split(" ");
            int l= strings.length;
            int[] arr = new int[l];
            int ans = 0;
            for(int i=0; i<l; i++){
                arr[i] = Integer.parseInt(strings[i]);
            }
            for(int i=0; i<l; i++){
                for(int j=i+1; j<l; j++){
                    int x = gcd(arr[i], arr[j]);
                    if(x>ans) ans = x;
                }
            }
            System.out.println(ans);
        }
    }
}
