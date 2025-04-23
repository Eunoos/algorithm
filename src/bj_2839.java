import java.util.Scanner;

public class bj_2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while (N>0){
            if(N%5==0){cnt+=N/5;break;}
            else N-=3; cnt+=1;
        }
        System.out.println(N<0?-1:cnt);
    }
}
