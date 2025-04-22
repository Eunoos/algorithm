import java.util.Scanner;

public class bj_16204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        //입력받기
        int N = Integer.parseInt(strings[0]);//전체카드 개수
        int M = Integer.parseInt(strings[1]);//ㅇ카드 개수
        int K = Integer.parseInt(strings[2]);//ㅇ적으려는 개수
        int X = N-M; //X개수
        int WX = N-K; // 적으려는 X개수
        System.out.println(Math.min(M,K)+Math.min(X,WX));
    }
}
