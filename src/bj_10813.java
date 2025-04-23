import java.util.*;

public class bj_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        //입력받기
        int N = Integer.parseInt(strings[0]);//공 개수
        int M = Integer.parseInt(strings[1]);//교환횟수
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }//[1,2,3,4,5]
        int X, Y, temp = 0; //교환담을 변수

        for(int i=0; i<M; i++){
            strings = sc.nextLine().split(" ");
            X = Integer.parseInt(strings[0]);
            Y = Integer.parseInt(strings[1]);
            temp = arr[X-1];//[0,1,2,3,4]
            arr[X-1] = arr[Y-1];
            arr[Y-1] = temp;
        }
        //형식 맞춰서 출력
        for(int i=0; i<N; i++){
            System.out.print(i<N-1?arr[i]+" ":arr[i]);//2345
        }
    }
}
