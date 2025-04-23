import java.util.*;
public class bj_10448 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int [] arr = new int[45];

        for(int i=1; i<46; i++){
            arr[i-1]=i*(i+1)/2;
        }
        for(int t=0; t<T; t++){
            int ans = 0;
            int X = Integer.parseInt(sc.nextLine());
            for(int i=0; i<45; i++){
                if(arr[i]>X) {break;}
                for(int j=0; j<45; j++){
                    for(int k=0; k<45; k++){
                        if(arr[i]+arr[j]+arr[k]==X) {ans=1; break;}
                    }
                }
            }
            System.out.println(ans);
        }

    }
}
