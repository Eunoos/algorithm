import java.util.*;

public class bj_11501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int x=0; x<T; x++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            String[] strings = sc.nextLine().split(" ");
            for(int n=0; n<N; n++){
                arr[n]= Integer.parseInt(strings[n]);
                System.out.println(arr[n]);
            }
        }
//
//        int R = Integer.parseInt(strings[0]);
//        int C = Integer.parseInt(strings[1]);
//        String[][] arr = new String[R][C];
//        String[] inputs = new String[C];
//        for(int i = 0; i<R; i++){
//            inputs = sc.nextLine().split(" ");
//            for(int j= 0; j<C; j++){
//                arr[i][j] = inputs[j];
//                System.out.println(arr[i][j]);
//            }
//        }

    }
}
