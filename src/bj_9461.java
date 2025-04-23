import java.util.*;
public class bj_9461 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(sc.nextLine());
            if(N<=3){System.out.println(1);}
            else if(N<=5){System.out.println(2);}
            else{
                long [] arr = new long[N];
                arr[0]=1;
                arr[1]=1;
                arr[2]=1;
                arr[3]=2;
                arr[4]=2;
                for(int k=5; k<N; k++){
                    arr[k]=arr[k-1]+arr[k-5];
                }
                System.out.println(arr[N-1]);
            }
        }
    }
}
