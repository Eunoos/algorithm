import java.util.*;
public class bj_2897 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int R = Integer.parseInt(strings[0]);
        int C = Integer.parseInt(strings[1]);
        String[][] arr = new String[R][C];
        String[] inputs = new String[C];
        for(int i = 0; i<R; i++){
            inputs = sc.nextLine().split(" ");
            for(int j= 0; j<C; j++){
                arr[i][j] = inputs[j];
                System.out.println(arr[i][j]);
            }
        }


    }
}

