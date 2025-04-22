import java.util.Scanner;

public class bj_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        //입력받기
        int N = Integer.parseInt(strings[0]);//공 개수
        int M = Integer.parseInt(strings[1]);//교환횟수
        int temp = 0; //교환담을 변수
        int X = 0;
        int Y = 0;
        int[] ints = new int[N];
        for(int i=0; i<N; i++){
            ints[i] = i+1;
        }
        for(int i=0; i<M; i++){
            strings = sc.nextLine().split(" ");
            X = Integer.parseInt(strings[0]);
            Y = Integer.parseInt(strings[1]);
            temp = ints[X-1];
            ints[X-1] = ints[Y-1];
            ints[Y-1] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(i<N-1?ints[i]+" ":ints[i]);
        }
    }
}
