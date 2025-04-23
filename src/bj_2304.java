import java.util.Scanner;

public class bj_2304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[1001];
        int ans = 0;
        int min = 0;
        int temp = 0;
        for(int i=0; i<N; i++){
            int L = sc.nextInt();
            int H = sc.nextInt();
            arr[L] = H;
        }
        for(int i=0; i<21; i++){
            if(min<arr[i]){
                ans+=min*temp+arr[i];
                min = arr[i];
                temp = 0;
            }else if(arr[i]==0){
                if(min!=0) temp+=1;
            }else{
                temp+=1;
                ans+=min*temp;
                temp = 0;
            }
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
